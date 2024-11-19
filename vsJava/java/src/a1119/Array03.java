package a1119;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println(size+"개의 배열 요소를 입력하세요");
        for(int i = 0; i< arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double) sum / size;

        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("합계 : "+sum);
        System.out.printf("평균 : %.2f\n", avg);
    }
}
