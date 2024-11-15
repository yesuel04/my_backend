package a1115;

import java.util.Scanner;

public class Cart1 {
    public static void main(String[] args) {

        boolean run = true;
        String myCart[];

        Scanner scan = new Scanner(System.in);

        while (run) {
            
            System.out.println("----------------------------------------------------------");
            System.out.println(" 1아이템 추가  |  2아이템 삭제  |  3카트 확인  |  4종료 ");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택 > ");
            int menuNum = Integer.parseInt(scan.nextLine());

            switch (menuNum) {
                case 1: 
                    System.out.print("추가할 아이템 > ");
                    String item = scan.nextLine();
                    System.out.print(item + "이(가) 카트에 추가되었습니다.");
                    // myCart.push('item');
                    break;
                case 2:
                    System.out.print("삭제할 아이템 > ");
                    String delete1 = scan.nextLine();
                    System.out.print(delete1 + "이(가) 카트에서 삭제되었습니다.");
                    break;
                case 3:
                    System.out.print("카드확인 > ");
                    // System.out.print(myCart[i]);
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
