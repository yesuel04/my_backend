package a1114;

import java.util.Scanner;

public class Condi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int a = scan.nextInt();

        String result = (a>=0 && a<=12) ? "어린이" :  (a>=13 && a<=19) ? "청소년" : "성인";
        System.out.println(result);
    }
}
