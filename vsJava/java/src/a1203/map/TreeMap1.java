package a1203.map;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // 삽입 시 put();
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        System.out.println("맵에 전장된 키들의 집합 : "+hm.keySet());
        for(String key : hm.keySet()){
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));

        }
    // 키 - 값 쌍으로 데이터 저장.
    // 각데이터는 고유한 키(key)와 이에 대응하는 값(value)으로 구성.
    // 순서 없음.
    // 중복도 허용.
    // null 허용.
    // 동기화 되지 않음.
    // 시간의 복잡도 평균.

    System.out.println();

    // 제거 시 remove()
    hm.remove("사십");

    Iterator<String> keys = hm.keySet().iterator();
    while (keys.hasNext()) {
        String key = keys.next();
        System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
    }
    System.out.println();
    System.out.println("맵의 크기 : "+hm.size());


    //TreeMap -1
    TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

    tm.put(30, "삼십");
    tm.put(10, "십");
    tm.put(40, "사십");
    tm.put(20, "이십");
    //TreeMap은 키를 자연 수서(알파벳, 숫자)로 정렬하여 출력.
    System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
    for (Integer key : tm.keySet()) {
        System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
    }

    //TreeMap -2
    TreeMap<String, Integer> tm1 = new TreeMap<>();

    tm1.put("ㄷㄷㄷ", 30);
    tm1.put("ㅎㅎㅎ", 70);
    tm1.put("ㅇㅇㅇ", 90);
    tm1.put("ㅋㅋㅋ", 10);

    System.out.println("맵에 저장된 키들의 집합 : " + tm1.keySet());
    for (String key : tm1.keySet()) {
        System.out.println(String.format("키 : %s, 값 : %s", key, tm1.get(key)));
    }
    }
}
