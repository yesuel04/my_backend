package a1112;

import java.util.Scanner;

public class Scan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력 : ");
        String x = scanner.nextLine();

        System.out.print("y 값 입력 : ");
        String y = scanner.next();

        // int result = x + y;
        // System.out.println("x + y : "+ result);
        System.out.println(x);
        System.out.println(y);

    }
    
}