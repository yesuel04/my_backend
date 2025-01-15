package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Planner {

    //식사 기록 출력하기(범용)
    private static void printMeal(Meal meal) {
        System.out.printf("| %-3s | %-12s | %-14s | %-14d 원 |\n", meal.getDay(), meal.getStore(), meal.getMenu(), meal.getPrice());
    }

    // 1. 식사 기록하기
    public static void addMeal(ArrayList<Meal> meals, Scanner scan) {
        System.out.print("날짜(예: 월요일) >> ");
        String day = scan.nextLine();

        System.out.print("가게 이름 >> ");
        String store = scan.nextLine();

        System.out.print("메뉴 >> ");
        String menu = scan.nextLine();

        System.out.print("가격(원) >> ");
        int price = scan.nextInt();
        scan.nextLine();

        meals.add(new Meal(day, store, menu, price));
        System.out.println("\n [ 식사 기록 완료 ] ");
    }

    // 2. 식사 기록 확인하기
    public static void viewMeals(ArrayList<Meal> meals) {
        if (meals.isEmpty()) {
            System.out.println(" [ 식사 기록이 없습니다. ] ");
            return;
        }

        System.out.println("\n [ 나의 식사 기록 ] ");
        System.out.println("+--------|---------------|-----------------|--------------+");
        System.out.println("| 요일   | 가게 이름     | 메뉴            | 가격(원)     |");
        System.out.println("|--------|---------------|-----------------|--------------|");
        for (Meal meal : meals) {
            printMeal(meal);
        }
        System.out.println("+--------|---------------|-----------------|--------------+");
    }

    // 3. 식사 기록 수정하기
    public static void updateMeal(ArrayList<Meal> meals, Scanner scan) {
        System.out.print("수정할 기록의 번호 (1부터 시작): ");
        int index = scan.nextInt() - 1;
        scan.nextLine();

        if (index < 0 || index >= meals.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        Meal meal = meals.get(index);
        System.out.println(" [ 수정할 식사 기록 확인 ] ");
        printMeal(meal);

        System.out.println(" [ 새로운 가게 이름을 입력해주세요. ] ");
        System.out.print(meal.store);
        System.out.print(" >> ");
        meal.store = scan.nextLine();

        System.out.println(" [ 새로운 메뉴를 입력해주세요. ] ");
        System.out.print(meal.menu);
        System.out.print(" >> ");
        meal.menu = scan.nextLine();

        System.out.println(" [ 새로운 가격(원)을 입력해주세요. ] ");
        System.out.print(meal.price);
        System.out.print(" >> ");
        meal.price = scan.nextInt();
        scan.nextLine();

        System.out.println(" [ 식사 기록이 수정되었습니다. ] ");
    }

    // 4. 식사 기록 삭제하기
    public static void deleteMeal(ArrayList<Meal> meals, Scanner scan) {
        System.out.print("삭제할 기록의 번호 (1부터 시작): ");
        int index = scan.nextInt() - 1;
        scan.nextLine();

        if (index < 0 || index >= meals.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        meals.remove(index);
        System.out.println(" [ 식사 기록이 삭제되었습니다. ] ");
    }

    // 5. 주간 총 금액 계산 메서드
    static void WeeklyTotal(ArrayList<Meal> meals) {
        int total = 0;
        for (Meal meal : meals) {
            total += meal.getPrice();
        }

        System.out.println("\n--------------- [ 주간 식사 총 금액 ] ---------------\n");
        System.out.printf("\t\t이번 주 식사 총 금액 >> %d 원\n", total);
        System.out.println("\n----------------------------------------------------\n");
    }

}
