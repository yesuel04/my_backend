package a1113;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        double a = scan.nextDouble();
        System.out.print("두번째 정수를 입력하세요 : ");
        double b = scan.nextDouble();
        System.out.print("세번째 정수를 입력하세요 : ");
        double c = scan.nextDouble();

        System.out.println("첫번째 정수 : "+ a);
        System.out.println("두번째 정수 : "+ b);
        System.out.println("세번째 정수 : "+ c);

        double total = a+b+c;
        System.out.println("a,b,c의 합 : "+ total);

        double avg = total/3;
        System.out.printf("a,b,c의 평균 : %.1f", avg);
    }
}
