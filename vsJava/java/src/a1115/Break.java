package a1115;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // while문에 true를 조건으로 넣으면 무한 루프.
        // Ctrl + C 로 강제로 무한루프 종료 가능.
        while (true) {
            System.out.print("입력 : ");
            String str = scan.nextLine();
            
            if(str.equals("q")){
                break;
            }

            System.out.println("입력받은 문자 : " + str);
        }
        System.out.println("종료");
    }
}
