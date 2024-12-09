package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Planner {

    // 식사 기록 추가
    public static void addMeal(ArrayList<Meal> meals, Scanner scanner) {
        System.out.print("날짜 (예: 월요일): ");
        String day = scanner.nextLine();

        System.out.print("가게명: ");
        String store = scanner.nextLine();

        System.out.print("메뉴: ");
        String menu = scanner.nextLine();

        System.out.print("가격(원): ");
        int price = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        meals.add(new Meal(day, store, menu, price));  // ArrayList에 추가
        System.out.println("식사 기록이 추가되었습니다.");
    }

    // 식사 기록 조회
    public static void viewMeals(ArrayList<Meal> meals) {
        if (meals.isEmpty()) {
            System.out.println("식사 기록이 없습니다.");
            return;
        }

        System.out.println("\n식사 기록:");
        System.out.println("| 요일   | 가게명       | 메뉴          | 가격(원)  |");
        System.out.println("|--------|--------------|---------------|-----------|");
        for (Meal meal : meals) {
            meal.printMeal();
        }
    }

    // 식사 기록 수정
    public static void updateMeal(ArrayList<Meal> meals, Scanner scanner) {
        System.out.print("수정할 기록의 번호 (1부터 시작): ");
        int index = scanner.nextInt() - 1;  // 인덱스는 0부터 시작하므로 1을 빼서 처리
        scanner.nextLine();  // 버퍼 비우기

        if (index < 0 || index >= meals.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        Meal meal = meals.get(index);
        System.out.println("수정할 식사 기록:");
        meal.printMeal();

        // 새로운 값 입력 받기
        System.out.print("새로운 가게명: ");
        meal.store = scanner.nextLine();

        System.out.print("새로운 메뉴: ");
        meal.menu = scanner.nextLine();

        System.out.print("새로운 가격(원): ");
        meal.price = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        System.out.println("식사 기록이 수정되었습니다.");
    }

    // 식사 기록 삭제
    public static void deleteMeal(ArrayList<Meal> meals, Scanner scanner) {
        System.out.print("삭제할 기록의 번호 (1부터 시작): ");
        int index = scanner.nextInt() - 1;  // 인덱스는 0부터 시작하므로 1을 빼서 처리
        scanner.nextLine();  // 버퍼 비우기

        if (index < 0 || index >= meals.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        meals.remove(index);  // ArrayList에서 해당 인덱스의 식사 기록을 삭제
        System.out.println("식사 기록이 삭제되었습니다.");
    }
}
