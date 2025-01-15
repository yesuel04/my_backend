package a1114;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~12월 중 하나를 입력하세요 : ");
        int a = scan.nextInt();

        if(3 <= a && a <= 5){
            System.out.println("봄 입니다.");
        }else if(6 <= a && a <= 8){
            System.out.println("여름 입니다.");
        }else if(9 <= a && a <= 11){
            System.out.println("가을 입니다.");
        }else if(1 <= a && a <= 2 || a == 12){
            System.out.println("겨울 입니다.");
        }else{
            System.out.println("다시 입력해주세요.");
        }
    }
}
