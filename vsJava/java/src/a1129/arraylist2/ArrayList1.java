package a1129.arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//컬렉션 프레임 워크
//List 인터페이스
//Set 인터페이스
//Map 인터페이스
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        //add메소드를 이용해서 요소를 저장.

        arraylist.add(10);
        arraylist.add(30);
        arraylist.add(25);

        System.out.println("리스트 출력 : "+arraylist);

        //array는 length가 아니라 size를 사용.
        for(int i=0; i<arraylist.size(); i++){
            System.out.println(arraylist.get(i) + " ");
        }

        //Enhanced for문 - for each문과 get메소드를 이용한 요소의 출력.
        for(int e : arraylist){
            System.out.print(e+" ");
        }

        System.out.println();

        //Collections.sort메소드를 이용한 요소의 정렬.
        Collections.sort(arraylist);
        for(int e : arraylist){
            System.out.print(e+" ");
        }

        //iterator() 메소드와 get()메소드를 이용한 요소 출력.
        //다양한 요소에 접근 List Map Set
        Iterator<Integer> iter = arraylist.iterator();
        while (iter.hasNext()) {
            //hasNext() 다음요소가 있을 때까지 순회.
            System.out.println(iter.next()+" ");
            //next 현재요소반환, 다음요소로 이동.
        }

        //set()메소드를 이용한 요소의 변경.
        arraylist.set(0, 20);
        System.out.println();
        for(int e : arraylist){
            System.out.print(e+" ");
        }

        //요소의 삽입
        arraylist.add(1, 50);
        System.out.println();
        for(int e : arraylist){
            System.out.print(e+" ");
        }

        System.out.println();

        System.out.println("리스트의 크기 : "+arraylist.size());

        arraylist.remove(3);
        for(int e : arraylist){
            System.out.print(e+" ");
        }
        
    }
}
