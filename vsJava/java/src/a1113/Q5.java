package a1113;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~9 중 하나를 입력하세요 : ");
        int a = scan.nextInt();

        int sum=0;
        for(int i=1; i<10; i++){
            sum=a*i;
            System.out.println(a + "*" + i + "=" + sum);
        }
    }
}
