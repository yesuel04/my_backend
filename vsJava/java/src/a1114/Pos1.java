package a1114;

import java.util.Scanner;

public class Pos1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int a = scan.nextInt();

        if(a<0){
            System.out.println("음수");
        }else if(a>0){
            System.out.println("양수");
        }else if(a==0){
            System.out.println("0");
        }
    }
}
