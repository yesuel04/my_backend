package a1115;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0;
        int money = 0;

        Scanner scan = new Scanner(System.in);

        while (run) {
            //System.out.println("1예금 2출금 3잔고 4종료");
            //scan 입력변수 menuNum
            //switch(menuNum)
            
            System.out.println("----------------------------------------");
            System.out.println(" 1예금  |  2출금  |  3잔고  |  4종료 ");
            System.out.println("----------------------------------------");
            System.out.print("선택 > ");
            int menuNum = Integer.parseInt(scan.nextLine());
            // System.out.println(menu + " ");

            switch (menuNum) {
                case 1: 
                    System.out.print("예금액 > ");
                    balance += Integer.parseInt(scan.nextLine());
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    balance -= Integer.parseInt(scan.nextLine());
                    break;
                case 3:
                    System.out.print("잔고 > ");
                    System.out.print(balance);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println(" 재입력 ");
                    break;
            }
            System.out.println();
        }
        System.out.println("----- 종료 -----");
    }
}
