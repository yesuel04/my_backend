package a1206.movie;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("\n프로그램을 시작합니다."); //초기메세지
        Menu menu = MainMenu.getInstance(); //"메인메뉴를 가져옴"
        // 메인메뉴 객체 생성
        while (menu != null) {
            menu.print(); //현재 메뉴 출력
            menu = menu.next();
        }
    }
}
interface Menu {
    void print(); // 메뉴 출력
    Menu next(); // 다음 메뉴로 이동
}
