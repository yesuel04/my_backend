package a1113;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = scan.nextInt();

        if(a % 2 == 0){
            System.out.println(a+"은(는) 짝수 입니다.");
        }else if(a % 2 == 1){
            System.out.println(a+"은(는) 홀수 입니다.");
        }
        
    }
}
