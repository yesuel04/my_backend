package a1114;

import java.util.Scanner;

public class Switch6 {
    public static void main(String[] args) {
        // 계절 출력
        // 사용자로부터 월(1~12)을 입력받아 해당 월에 맞는 계절을 출력하는 프로그램을 작성하세요.

        // 예시:
        // 3, 4, 5: 봄
        // 6, 7, 8: 여름
        // 9, 10, 11: 가을
        // 12, 1, 2: 겨울

        Scanner scan = new Scanner(System.in);
        System.out.print("1~12 중 하나를 입력하세요 : ");
        int a = scan.nextInt();

        switch (a) {
            case 1,2,12:
                System.out.println("겨울 입니다.");
                break;
            case 3,4,5:
                System.out.println("봄 입니다.");
                break;
            case 6,7,8:
                System.out.println("여름 입니다.");
                break;
            case 9,10,11:
                System.out.println("가을 입니다.");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
                break;
        }
    }
}
