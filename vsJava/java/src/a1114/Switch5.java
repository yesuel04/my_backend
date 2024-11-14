package a1114;

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        // 간단한 계산기
        // 사용자로부터 두 숫자와 연산자를 입력받아 계산 결과를 출력하는 프로그램을 작성하세요. 연산자는 +, -, *, / 중 하나입니다.
        
        // 예시:
        // 숫자 5, 연산자 +, 숫자 3을 입력하면 5 + 3 = 8을 출력

        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        double a = scan.nextDouble();
        System.out.print("연산자를 입력하세요(+,-,*,/ 중 하나) : ");
        char b = scan.next().charAt(0); // 입력된 첫글자(인덱스0) 문자삽입.
        System.out.print("두번째 숫자를 입력하세요 : ");
        double c = scan.nextDouble();

        switch (b) {
            case '+':
                System.out.println("결과 : " + (a + c));
                break;
            case '-':
                System.out.println("결과 : " + (a - c));
                break;
            case '*':
                System.out.println("결과 : " + (a * c));
                break;
            case '/':
                if(c != 0){
                    System.out.println("결과 : " + (a / c));
                }else{
                    System.out.println("0으로는 나눌 수 없습니다");
                }
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
        }
        scan.close();
    }
}
