package a1128.ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        //특정위치에 요소삽입 가능

        ArrayList<String> list = new ArrayList<>();
        
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        System.out.println("일단 출력");

        Collections.sort(list);
        System.out.println("정렬 후 출력 : "+list);

        Collections.reverse(list);
        System.out.println("정렬 후 출력 : "+list);

        
    }
}
