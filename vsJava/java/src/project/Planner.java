package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Planner {

    // 식사 기록 출력하기
    private static void printMeal(Meal meal) {
        System.out.printf("\n%d-%02d-%02d | 가게 이름 : %s | 메뉴 : %s | %,d 원\n", meal.getYear(), meal.getMonth(), meal.getDay(),
                meal.getStore(), meal.getMenu(), meal.getPrice());
    }

    // 식사 기록 찾기
    public static int findMealIndex(int year, int month, int day, ArrayList<Meal> mealLog) {
        for (int i = 0; i < mealLog.size(); i++) {
            Meal meal = mealLog.get(i);
            if (meal.year == year && meal.month == month && meal.day == day) {
                return i;
            }
        }
        return 1;
    }

    // 1. 식사 기록하기
    public static void addMeal(ArrayList<Meal> mealLog) {
        System.out.println("\n [ 식사 기록하기 ] ");
        Scanner scan = new Scanner(System.in);

        System.out.print("연도 (YYYY) >> ");
        int year = Integer.parseInt(scan.nextLine());
        System.out.print("월 (MM) >> ");
        int month = Integer.parseInt(scan.nextLine());
        System.out.print("일 (DD) >> ");
        int day = Integer.parseInt(scan.nextLine());
        System.out.print("가게 이름 >> ");
        String store = scan.nextLine();
        System.out.print("메뉴 >> ");
        String menu = scan.nextLine();
        System.out.print("가격 >> ");
        int price = Integer.parseInt(scan.nextLine());

        mealLog.add(new Meal(year, month, day, store, menu, price));
        System.out.println("\n [ 식사 기록 완료 ] ");
    }

    // 2. 식사 기록 확인하기
    public static void viewMeals(ArrayList<Meal> mealLog) {
        System.out.println("\n [ 식사 기록 확인하기 ] \n");
        if (mealLog.isEmpty()) {
            System.out.println(" [ 식사 기록이 없습니다. ] ");
            return;
        }

        System.out.println("\n [ 나의 식사 기록 ] ");
        System.out.println("-------------------------------------------------------------------------");
        for (Meal meal : mealLog) {
            printMeal(meal);
        }
        System.out.println("\n-------------------------------------------------------------------------");
    }

    // 3. 식사 기록 수정하기
    public static void updateMeal(ArrayList<Meal> mealLog) {
        System.out.println("\n [ 식사 기록 수정하기 ] \n");
        if (mealLog.isEmpty()) {
            System.out.println(" [ 식사 기록이 없습니다. ] ");
            return;
        }

        System.out.println("-------------------------------------------------------------------------");
        for (Meal meal : mealLog) {
            printMeal(meal);
        }
        System.out.println("\n-------------------------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.print("\n수정할 기록의 연도 (YYYY) >> ");
        int updateYear = Integer.parseInt(scan.nextLine());
        System.out.print("수정할 기록의 월 (MM) >> ");
        int updateMonth = Integer.parseInt(scan.nextLine());
        System.out.print("수정할 기록의 일 (DD) >> ");
        int updateDay = Integer.parseInt(scan.nextLine());

        int index = findMealIndex(updateYear, updateMonth, updateDay, mealLog);
        if (index != 1) {
            System.out.print("새로운 가게 이름 >> ");
            String updateStore = scan.nextLine();
            System.out.print("새로운 메뉴 >> ");
            String updateMenu = scan.nextLine();
            System.out.print("새로운 가격 >> ");
            int updatePrice = Integer.parseInt(scan.nextLine());
            mealLog.set(index, new Meal(updateYear, updateMonth, updateDay, updateStore, updateMenu, updatePrice));
            System.out.println(" [ 식사 기록이 수정되었습니다. ] ");
        } else {
            System.out.println(" [ 해당 날짜의 기록을 찾을 수 없습니다. ] ");
        }
    }

    // 4. 식사 기록 삭제하기
    public static void deleteMeal(ArrayList<Meal> mealLog) {
        System.out.println("\n [ 식사 기록 삭제하기 ] \n");
        if (mealLog.isEmpty()) {
            System.out.println(" [ 식사 기록이 없습니다. ] ");
            return;
        }

        System.out.println("-------------------------------------------------------------------------");
        for (Meal meal : mealLog) {
            printMeal(meal);
        }
        System.out.println("\n-------------------------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.print("\n삭제할 기록의 연도 (YYYY) >> ");
        int deleteYear = Integer.parseInt(scan.nextLine());
        System.out.print("삭제할 기록의 월 (MM) >> ");
        int deleteMonth = Integer.parseInt(scan.nextLine());
        System.out.print("삭제할 기록의 일 (DD) >> ");
        int deleteDay = Integer.parseInt(scan.nextLine());

        int index = findMealIndex(deleteYear, deleteMonth, deleteDay, mealLog);
        if (index != 1) {
            mealLog.remove(index);
            System.out.println(" [ 식사 기록이 삭제되었습니다. ] ");
        } else {
            System.out.println(" [ 해당 날짜의 기록을 찾을 수 없습니다.] ");
        }
    }

    // 5. 월간 총 금액 계산
    static void monthTotal(ArrayList<Meal> mealLog) {
        System.out.println("\n [ 월간 총 금액 계산하기 ] \n");
        if (mealLog.isEmpty()) {
            System.out.println(" [ 식사 기록이 없습니다. ] ");
            return;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("연도 (YYYY) >> ");
        int targetYear = Integer.parseInt(scan.nextLine());
        System.out.print("월 (MM) >> ");
        int targetMonth = Integer.parseInt(scan.nextLine());

        int total = 0;
        for (Meal meal : mealLog) {
            if (meal.year == targetYear && meal.month == targetMonth) {
                total += meal.price;
            }
        }

        System.out.println("\n--------------- [ 월간 식사 총 금액 ] ---------------\n");
        System.out.printf("%d년 %d월 총 금액: %,d 원 \n", targetYear, targetMonth, total);
        System.out.println("\n----------------------------------------------------\n");
        
    }

}
