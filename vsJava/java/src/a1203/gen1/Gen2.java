package a1203.gen1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gen2 {
    public static void main(String[] args) {
        ArrayList<String> piches = new ArrayList<>();
        
        piches.add("123");
        piches.add("129");
        // 제네릭스를 사용하지 않으면 ArrayList에 추가하는 객체는
        // Object 자료형 - 모든 객체가 상속하고 있는 가장 기본적인 자료형.
        // 자료를 넣을 때는 문제가 없지만 값을 가져을 때는 
        // OBject 자료형에서 String 자료형으로 형변환(casting) 해야한다.

        String one = (String) piches.get(0);
        String two = (String) piches.get(1);
    }
}
