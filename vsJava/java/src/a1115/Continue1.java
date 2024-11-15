package a1115;

import java.util.Scanner;

public class Continue1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for(int i=0; i<5; i++){
            System.out.printf((i+1)+"번째 숫자를 입력하세요 : ");
            int n = scan.nextInt();
            
            if(n<0){
                continue;
            }
            sum += n;
        }
        System.out.printf("양수의 합 : "+ sum);
        scan.close();
    }
}
