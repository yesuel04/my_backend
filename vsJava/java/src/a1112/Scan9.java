package a1112;

import java.util.Scanner;

public class Scan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("시간 : ");
        String a = scanner.next();

        System.out.print("분 : ");
        String b = scanner.next();

        // int result = x + y;
        // System.out.println("x + y : "+ result);
        // System.out.println(x);
        // System.out.println(y);

        System.out.println(a+"시 : "+b+"분");
    }
    
}
// 시간이 특정 형식에 맞추어 입력될 때 그대로 출력하는 프로그램을 작성 해보자.
// 입력
// 시(hour)와 분(minute)이 구분되어 입력된다.
// 시와 분은 두 개의 정수로 입력받는다.
// 출력
// 입력받은 시간을 "시:분"으로 출력한다.

// 입력 예시 
// 3
// 16

// 출력 예시
// 3:16

// 도움말
// Scanner를 이용하여 2개의 변수를 따로 따로 받아서 처리한다.