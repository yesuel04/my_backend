package a1114;

import java.util.Scanner;

public class Yun1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = scan.nextInt();

        String result = 
        ((year%4==0 && year%100!=0) || (year%400==0) ? "윤년 입니다." : "윤년이 아닙니다.");
        
        System.out.println(result);
    }
}
