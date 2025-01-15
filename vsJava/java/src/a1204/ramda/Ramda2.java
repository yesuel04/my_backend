package a1204.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "orange");
        
        names.sort((s1,s2)->s2.compareTo(s1));
        System.out.println("내림차순 정렬" + names);
        System.out.println();

        names.sort(String::compareTo);
        System.out.println("오름차순 정렬" + names);
    }
}
