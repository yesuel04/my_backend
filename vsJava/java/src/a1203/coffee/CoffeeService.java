package a1203.coffee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
    private boolean reOrder = false; // 고객의 추가주문 여부.
    private int orderNum = 1;

    public CoffeeService() {
        LinkedHashMap orderList = new LinkedHashMap<>();
    } // orderList : 고객 주문 저장.
      // LinkedHashMap<>() : 입력순서 또는 접근순서 보장,
      // 속도는 약간 느림, 용도는 순서가 중요한 경우에 사용.

    // 커피 객체 준비
    Coffee coffee = Coffee.getInstance(); // 커피메뉴를 관리하는 싱글톤 객체.
    // 손님
    Customer customer;
    // 지연클래스 준비.
    Thread t = new Thread();
    Map<String, Integer> orderList;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("\n\n ~ 어서오세요. 연세IT 커피숍 입니다. ~ ");
        customer = new Customer(orderNum);
        coffee.getMenu();

        order();
    }

    private void order() {
        System.out.println("\n ~ 취소를 원하시면 0번을 눌러주세요. ~ ");

        end: while (true) {
            try {
                System.out.println("\n ~ 원하시는 음료의 번호를 선택해주세요. ~ ");
                String choice = sc.next();
                int choiceNum = Integer.parseInt(choice.substring(0, 1));

                if (choiceNum == 0) {
                    System.out.println(" - 주문을 취소 합니다. - ");
                    System.exit(0);
                }
                sc.nextLine();
                String coffeeName = coffee.coffeeList.get(choiceNum - 1);
                System.out.println("선택하신 음료는 " + coffeeName + " 입니다. 몇 잔 주문하시겠습니까?");
                int orderCount = sc.nextInt();
                sc.nextLine();

                if (reOrder) {
                    for (String coff : orderList.keySet()) {
                        if (coff.equals(coffeeName)) {
                            int addCount = orderList.get(coff).intValue() + orderCount;
                            orderList.replace(coffeeName, addCount);
                        } else {
                            orderList.put(coffeeName, orderCount);
                            break;
                        }
                    }
                } else {
                    orderList.put(coffeeName, orderCount);
                }
                addOrder();
                customer.setCoffeeOrder(orderList);
                break end;

            } catch (Exception e) {
                System.out.println("잘못된 입력값 입니다.");
                continue;
            }
        }
    }

    private void addOrder() {
        reOrder = false;
        System.out.println("\n ~ 주문을 계속하겠습니까? ~ ");
        System.out.println("\n 예(Y) / 아니오(N)");
        String yesOrNo = sc.next();

        if (yesOrNo.equals("예") || yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("Y")) {
            coffee.getMenu();
            reOrder = true;
            order();
        } else if (yesOrNo.equals("아니오") || yesOrNo.equalsIgnoreCase("n") || yesOrNo.equalsIgnoreCase("N")) {
            coffee.getMenu();
            reOrder = false;
            order();
        }
    }

}


//coffeeList - 커피이름 (리스트)
//coffeePrice - 커피가격 (리스트)
//menu는 coffeeList과 coffeePrice가 담겨있는 맵.
//orderList(커피 이름, 수량)
