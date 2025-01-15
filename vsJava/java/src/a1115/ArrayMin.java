package a1115;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇개의 정수를 입력받을까요? : ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print((i+1)+"번째 정수를 입력하세요. : ");
            arr[i] = scan.nextInt();
        }

        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + "  ");
        }

        // int min = 99999;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("최소값 : "+min);
        scan.close();        
        // System.out.println();
    }
}
