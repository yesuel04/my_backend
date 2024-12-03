package a1203.coffee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Coffee {
    private static Coffee instance;

    private Coffee() {}

    public static Coffee getInstance() {
        if (instance == null) {
            instance = new Coffee();
        }
        return instance;
    }

    ArrayList<String> coffeeList; //커피 종류
    ArrayList<Integer> coffeePrice; //커피 가격
    Map<String, Integer> menu; // 메뉴. 커피 종류와 가격.

    public void getMenu() {
        menu = new LinkedHashMap<String, Integer>();
        coffeeList = new ArrayList<>();
        coffeePrice = new ArrayList<>();

        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("녹차라떼");
        coffeeList.add("아이스티");
        coffeeList.add("요거트 스무디");
        coffeeList.add("트로피컬 블렌딩 티");
        coffeeList.add("바닐라 라떼");

        coffeePrice.add(2000);
        coffeePrice.add(3000);
        coffeePrice.add(3500);
        coffeePrice.add(2500);
        coffeePrice.add(4000);
        coffeePrice.add(5000);
        coffeePrice.add(3500);

        for (int i = 0; i < coffeeList.size(); i++) {
            menu.put(coffeeList.get(i), coffeePrice.get(i));
        }

        DecimalFormat f = new DecimalFormat("#,### 원");
        StringBuffer st = new StringBuffer();

        st.append("\n\n");
        st.append("+------------------------------------------------------+\n");
        st.append("+--------------------- 메뉴판 -------------------------+\n");
        st.append("+          MENU                           PRICE        +\n");

        System.out.println(st.toString());
        int s = 1;

        for (Entry<String, Integer> get : menu.entrySet()) {
            System.out.printf("|  [%d번]  %-20s\t:  %s    |\n", s, get.getKey(), f.format(get.getValue()));
            s++;
        }
        System.out.println("+------------------------------------------------------+\n");
    }
}
