package a1113;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = scan.nextInt();

        int sum=0;
        for(int i=1; i<=a; i++){
            sum=sum+i;
        }
        System.out.println("1에서 " + a + "까지의 합은 " + sum + " 입니다.");
    }
}
