package a1206.movie;

import java.io.IOException;
import java.util.ArrayList;

import a1122.final1;

public class MainMenu extends AbstractMenu {

    private static final MainMenu instance = new MainMenu(null);

    public static MainMenu getInstance() {
        return instance;
    } // 메인메뉴에 대한 싱글톤 패턴. - 하나의 객체 만들기.

    private static final String MAIN_MENU_TEXT = "1. 영화 예매하기 \n" +
            "2. 예매 확인하기\n" +
            "3. 예매 취소하기\n" +
            "4. 관리자 메뉴로 이동\n" +
            "q: 종료\n\n" +
            "메뉴를 선택하세요: ";

    private MainMenu(Menu prevMenu) {
        super(MAIN_MENU_TEXT, prevMenu);
    }

    @Override
    public Menu next() {

        switch (scanner.nextLine()) {
            case "1":
                reserve(); // 영화예매를 진행.
                return this; // 메인 메뉴 객체 반환(다시 메인 메뉴가 나옴.)
            case "2":
                checkReservation();
                return this;
            case "3":
                cancelReservation();
                return this;
            case "4":
                if (!checkAdminPassword()) { // 관리자 비밀번호 확인
                    System.out.println(">> 비밀번호가 틀렸습니다.");
                    return this; // 실패한 경우 메인 메뉴 객체반환
                }
                AdminMenu adminMenu = AdminMenu.getInstance(); // 관리자 객체를 가져옴
                adminMenu.setPrevMenu(this); // 메인 메뉴를 이전 메뉴로 등록
                return adminMenu; // 관리자 객체를 반환
            case "q":
                return null;

            default:
                break;
        }

        return null;
    }

    private boolean checkAdminPassword() {
        System.out.println("관리자 비밀번호를 입력하세요:");
        return "admin1234".equals(scanner.nextLine()); // 세미콜론 추가
    }

    private void checkReservation() {
        System.out.println("발급 번호를 입력하세요 : ");
        try {
            Reservation r = Reservation.findById(scanner.nextLine());
            if (r != null) {
                System.out.printf(">>[확인완료] %s\n", r.toString());
            } else {
                System.out.println("예매 내역 없음");
            }
        } catch (IOException e) {
            System.out.println("파일 입출력에 문제가 발생.");
        }
    }

    private void cancelReservation() {
        System.out.print("발급번호를 입력하세요");
        try {
            Reservation canceled = Reservation.cancel(scanner.nextLine()); // 예매확인
            if (canceled != null) {
                System.out.printf(">>[예매취소완료] %s\n", canceled.toString());
            } else {
                System.out.println(">>예매내역 없음");
            }
        } catch (IOException e) {
            System.out.println(">> 파일입출력에 문제가 발생");
        }
    }

    private void reserve() {
        try {
            ArrayList<Movie> movies = Movie.findAll();
            for (int i = 0; i < movies.size(); i++) {
                System.out.printf("%s\n", movies.get(i).toString());
            }
            System.out.println("예매할 영화를 선택해주세요 : ");
            String movieIdStr = scanner.nextLine();
            Movie m = Movie.findById(movieIdStr); // 예매할 영화 찾음.
            ArrayList<Reservation> reservations = Reservation.findByMovieId(movieIdStr);
            Seats seats = new Seats(reservations);
            seats.show();
            System.out.println(" 좌석을 선택하세요(E-9) : ");
            String seatName = scanner.nextLine();
            seats.mark(seatName);

            Reservation r = new Reservation(
                    Long.parseLong(movieIdStr),
                    m.getTitle(),
                    seatName);
            r.save();
            System.out.println(">> 예매 성공");
            System.out.printf(">> 예매 실패 : %s\n", r.getId());
        } catch (IOException e) {
            System.out.printf(">> 파일 입출력에 문제가 생겼어요 : %s\n", e.getMessage());
            e.printStackTrace(); // 예외 스택 추적 출력
        } catch (Exception e) {
            System.out.printf(">> 예매 실패 : %s\n", e.getMessage());
        }
    }

}
