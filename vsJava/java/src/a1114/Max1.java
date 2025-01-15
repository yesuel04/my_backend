package a1114;

import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int num2 = scan.nextInt();
        System.out.print("세번째 숫자 입력 : ");
        int num3 = scan.nextInt();

        System.out.println("--------------------------");

        int big1 = num1>num2 ? num1 : num2;
        int big2 = num1>num3 ? num1 : num3;
        int big3 = big1>big2 ? big1 : big2;

        System.out.println("가장 큰 숫자는 " + big3 + " 입니다.");
        System.out.println("--------------------------");

        int max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println("가장 큰 숫자는 " + max + " 입니다.");
        
    }
}
