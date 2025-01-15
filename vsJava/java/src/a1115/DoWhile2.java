package a1115;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {

        //변수 선언:메뉴번호, 메뉴이름.
        int menuNo=0;
        String menuName = "";
        Scanner scan = new Scanner(System.in);
        
        //do while 문 : 무조건 1회 실행 후 조건을 검사하여 반복.
        do{
            System.out.println("---- 점심 메뉴판 ----");
            System.out.println("1. 서브웨이 에그마요");
            System.out.println("2. 신라면");
            System.out.println("3. 삼양라면 & 주먹밥");
            System.out.println("4. 라볶이");
            System.out.println("5. 잔치국수");
            System.out.println("6. 된장찌개");
            System.out.println("7. 짜장밥");
            System.out.println("8. 닭고기 덮밥");
            System.out.println("9. 샐러드");
            System.out.println("10. 만두");
            System.out.print("메뉴 번호 : ");

            menuNo = scan.nextInt();

            switch(menuNo){
                case 1 : menuName = "서브웨이 에그마요";
                break;
                case 2 : menuName = "신라면";
                break;
                case 3 : menuName = "삼양라면 & 주먹밥";
                break;
                case 4 : menuName = "라볶이";
                break;
                case 5 : menuName = "잔치국수";
                break;
                case 6 : menuName = "된장찌개";
                break;
                case 7 : menuName = "짜장밥";
                break;
                case 8 : menuName = "닭고기 덮밥";
                break;
                case 9 : menuName = "샐러드";
                break;
                case 10 : menuName = "만두";
                break;
                default : menuName = "배고파";
                break;
            }

            //메뉴번호 유효성 검사
            if(menuNo != 0 && menuNo <= 0){
                System.out.println(menuName + "을(를) 먹었다!");
            }else if(menuNo != 0){
                System.out.println(menuName);
            }

        }while(menuNo != 0);

        System.out.println("메뉴판 선택 종료");
        scan.close();

    }
}
