package a1205;

// import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//자바 컬렉션
// 다수의 데이터를 쉽고 효과적으로 처리
//List 인터페이스
//Map
//Set 

public class Set1 {
    public static void main(String[] args) {
        //객체 선언
        Set<String> set = new HashSet<String>();

        set.add("apple");
        set.add("banana");
        set.add("mango");
        set.add("cherry");
        System.out.println();
        for(String e : set){
            System.out.println(e);
        }

        System.out.println();

        set.remove("apple");
        set.add("orange");
        set.add("orange");
        for(String e : set){
            System.out.println(e);
        }

        System.out.println();

        Iterator<String> iterSet = set.iterator();
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next()+" ");
        }

        System.out.println();

        System.out.println(set);
        System.out.println(set.contains("kiwi"));

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
        
    }
}
