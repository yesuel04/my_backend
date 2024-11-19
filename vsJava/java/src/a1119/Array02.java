package a1119;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        for(int i=0;i<week.length;i++){
            System.out.print(week[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(week));
        System.out.println();

        // foreach : ctrl + space바 > f 눌러서 빠르게 찾기
        for (String day : week) {
            System.out.println(day + " ");
        }
    }
}
