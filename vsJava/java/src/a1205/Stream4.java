package a1205;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"넷", "셋", "둘", "하나"};

        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.println(e+" "));
        System.out.println();
        //배열의 특정 부분만을 이용
        Stream<String> stream2 = Arrays.stream(arr,1,3);
        stream2.forEach(e -> System.out.println(e+" "));
        //1,3 시작 인덱스와 끝인덱스 1부터 3전까지.
    }
}
