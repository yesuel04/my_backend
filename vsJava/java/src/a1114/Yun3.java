package a1114;

import java.util.Scanner;

public class Yun3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = scan.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("윤년 입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
