package a1119;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] number = new int[10];
        int sum = 0;
        for(int i=0; i<number.length; i++){
            number[i] = i+1;
            sum += number[i];
        }
        System.out.println(Arrays.toString(number));
        System.out.println("모든 요소의 합 : " + sum);
    }
}