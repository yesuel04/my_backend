package a1119;

import java.util.Random;

public class Array04_2 {
    public static void main(String[] args) {

        // 숫자 6개 뽑기(중복있음)
        int[] numbers = new int[10];
        Random random1 = new Random();

        //랜덤한 숫자를 생성하는 클래스를 객체로 생성.
        for(int i=0; i<numbers.length; i++){
            numbers[i]=random1.nextInt(100);
        }
        //컴퓨터에게 숫자 배열의 1번째 자리에 0~99 사이의 랜덤한 숫자 하나 넣기.
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
