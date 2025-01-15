package a1118;

import java.util.Arrays;

public class Suffle2 {
    public static void main(String[] args) {

        int[] ballNum = new int[45];

        for(int i=0; i<ballNum.length; i++){
            ballNum[i] = i+1;
        }
        System.out.print(Arrays.toString(ballNum));
        System.out.println();

        for(int i=0; i<500; i++){
            int n=(int)(Math.random()*45); //(0~9)
            int tmp = ballNum[0];
            ballNum[0] = ballNum[n];
            ballNum[n] = tmp;
        }
        System.out.print(Arrays.toString(ballNum));
        System.out.println(); 

        for(int i=0;i<6;i++){
            System.out.printf("ball[%d]=%d\n", i , ballNum[i]);
        }
    }
}
