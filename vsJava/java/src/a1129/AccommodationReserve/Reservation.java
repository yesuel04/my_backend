package a1129.AccommodationReserve;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AccManager manager = new AccManager(); //숙소 관리 객체
        boolean flag = true;

        while (flag) {
            System.out.println("\n < 숙소 예약 시스템에 오신 것을 환영합니다. >");
            System.out.println("1. 예약 가능한 숙소 보기");
            System.out.println("2. 숙소 예약하기");
            System.out.println("3. 예약한 숙소 보기");
            System.out.println("4. 숙소 추가하기");
            System.out.println("5. 숙소 삭제하기");
            System.out.println("6. 숙소 정보 수정하기");
            System.out.println("7. 숙소 내용 보기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요 > ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(" [ 예약 가능한 숙소 ]");
                    manager.disAvailAccommodations();
                    break;

                case 2:
                    System.out.println(" [ 숙소 예약하기 ] ");
                    System.out.print("예약하려는 숙소의 이름을 입력하세요. >> ");
                    String accommodations = scan.nextLine();

                    if(manager.bookedAccommodations(accommodations)){
                        System.out.println(" [ 숙소가 성공적으로 예약되었습니다. ] ");
                    }else{
                        System.out.println(" [ 숙소가 예약 가능하지 않거나 존재하지 않습니다. ] ");
                    }
                    break;
                    //예약할 수 있는 숙소가 있으면 예약한 후 true를 반환.
                    //예약할 수 있는 숙소가 없으면 false.
            

                case 3:
                    System.out.println(" [ 예약한 숙소 보기 ] ");
                    manager.disBookedAccommodation();
                    break;

                case 4:
                    System.out.print(" [ 추가하려는 숙소 이름을 입력하세요. ] \n 숙소 이름 >> ");
                    String newName = scan.nextLine();
                    System.out.print("숙소 지역 >> ");
                    String newLocation = scan.nextLine();
                    System.out.print("1박당 숙박 가격 >> ");
                    Double newPrice = scan.nextDouble();
                    scan.nextLine();

                    System.out.print(newName + " >> ");
                    if(newName.equals("")){
                        System.out.print("추가하려는 숙소 이름 입력 \n 숙소 이름 >> ");
                        newName = scan.nextLine();
                    }
                    manager.addAccommodation(newName, newLocation, newPrice);
                    System.out.println(" [ 숙소 추가 완료 ] ");
                    break;

                case 5:
                    System.out.println(" [ 숙소 삭제하기 ] ");
                    System.out.print(" 삭제하려는 숙소의 이름을 작성해주세요. >> ");
                    String dname = scan.nextLine();

                    if(dname.equals("")){
                        System.out.print("삭제하려는 숙소의 이름을 다시 작성해주세요. >> ");
                        dname = scan.nextLine();
                    }
                    manager.deleteAccommodation(dname);
                    System.out.println(" [ 숙소 삭제 작업 완료 ] ");
                    break;

                case 6:
                    System.out.println(" [ 숙소 정보 수정하기 ] ");
                    System.out.print(" 수정하려는 숙소의 이름을 작성해주세요. >> ");
                    String uname = scan.nextLine();
                    System.out.println(uname);

                    if(uname.equals("")){
                        System.out.print("수정하려는 숙소의 이름을 새로 작성해주세요. >> ");
                        newName = scan.nextLine();
                    }
                    manager.updateAccommodation(uname);
                    System.out.println(" [ 수정 작업 완료 ] ");
                    break;

                case 7:
                    System.out.println(" [ 숙소 내용 보기 ] ");
                    System.out.print(" 조회하려는 숙소의 이름을 작성해주세요. >> ");
                    String sname = scan.nextLine();

                    if(sname.equals("")){
                        System.out.print("조회하려는 숙소의 이름을 다시 작성해주세요. >> ");
                        newName = scan.nextLine();
                    }
                    manager.showAccommodation(sname);
                    System.out.println(" [ 조회 완료 ] ");
                    break;

                case 8:
                    System.out.println("[ 종료합니다. ]");
                    flag = false;
                    scan.close();
                    System.exit(0);
                    break;
            
                default:
                    System.out.println(" [ 다시 입력하세요. ] ");
                    break;
            }
        }
    }
}
