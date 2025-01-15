package a1115;

import java.util.Scanner;

public class Array3 {

        // 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최댓값을 구하여 출력하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력예시)
		// 최댓값 : 100
        /*
			(순서도)	
			1. 정수 하나를 입력받는다.
			2. 입력받은 정수를 변수 N에 대입한다
			3. N번 반복하여 N개의 정수를 입력받는다
			4. 입력받은 N개의 정수를 배열 arr 에 저장한다
			5. 배열 arr 를 반복하여, max 와 i번째 요소를 비교한다
			6. 두 요소 중 더 큰 요소를 변수 max 에 대입한다
			7. 반복이 끝나고, 변수 max 를 출력한다
		 */
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
        
        // System.out.println();
    }
}
