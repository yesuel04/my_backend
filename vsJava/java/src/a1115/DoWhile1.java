package a1115;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        do{
            System.out.print("숫자 입력 : ");
            number = scan.nextInt();
            System.out.println("입력한 숫자 : " + number);
        }while(number != 0);
        System.out.println("프로그램 종료");

    }
}
