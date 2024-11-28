package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        //특정위치에 요소삽입 가능

        ArrayList<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //요소가 존재하는지 확인
        System.out.println("바나나 있니?"+list.contains("Banana"));
        System.out.println("포도 있니?"+list.contains("Grapes"));

        System.out.println("list의 개수 : "+list.size());

        String fruit = list.get(1);
        System.out.println("검색된 내용 출력 : "+fruit);

        for(String fruit1 : list){
            System.out.println(fruit);
        }
    }
}
