package a1204.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "orange");
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        names.forEach(name -> System.out.println(name));
        System.out.println();
        names.stream()
            .filter(name->name.length() >= 6)
            .forEach(System.out::println);
    }
}
