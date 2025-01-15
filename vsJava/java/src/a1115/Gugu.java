package a1115;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~9 중 하나 입력 : ");
        int a = scan.nextInt();

        for(int i=1; i<10; i++){
            int b = a*i;
            System.out.println(a+"*"+i+"="+b);

        }
        scan.close();
    }
}
