package project;

import java.util.*;
import java.time.*;
import java.time.temporal.IsoFields;

class Meal {
    int year;
    int month;
    int day;
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    String store;
    String menu;
    int price;

    public Meal(int year, int month, int day, String store, String menu, int price) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.store = store;
        this.menu = menu;
        this.price = price;
    }

    LocalDate getDate() {
        return LocalDate.of(this.year, this.month, this.day);
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d | %s | %s | %,d 원", year, month, day, store, menu, price);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

public class MealTracker {
    private static ArrayList<Meal> mealLog = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addMeal(int year, int month, int day, String store, String menu, int price) {
        mealLog.add(new Meal(year, month, day, store, menu, price));
        mealLog.sort(Comparator.comparing(Meal::getDate)); // 날짜 기준으로 정렬
    }

    public static int findMealIndex(int year, int month, int day) {
        for (int i = 0; i < mealLog.size(); i++) {
            Meal meal = mealLog.get(i);
            if (meal.year == year && meal.month == month && meal.day == day) {
                return i;
            }
        }
        return 1;
    }

    public static void updateMealByDate(int year, int month, int day) {
        int index = findMealIndex(year, month, day);
        if (index != 1) {
            System.out.print("가게 이름: ");
            String updateStore = scanner.nextLine();
            System.out.print("메뉴: ");
            String updateMenu = scanner.nextLine();
            System.out.print("가격: ");
            int updatePrice = Integer.parseInt(scanner.nextLine());
            mealLog.set(index, new Meal(year, month, day, updateStore, updateMenu, updatePrice));
            System.out.println("기록이 업데이트되었습니다.");
        } else {
            System.out.println("해당 날짜의 기록을 찾을 수 없습니다.");
        }
    }

    public static void deleteMealByDate(int year, int month, int day) {
        int index = findMealIndex(year, month, day);
        if (index != 1) {
            mealLog.remove(index);
            System.out.println("기록이 삭제되었습니다.");
        } else {
            System.out.println("해당 날짜의 기록을 찾을 수 없습니다.");
        }
    }

    public static void getWeeklyBreakdown(int year, int month) {
        Map<Integer, Integer> weeklyTotal = new TreeMap<>();
        for (Meal meal : mealLog) {
            if (meal.year == year && meal.month == month) {
                int week = meal.getDate().get(IsoFields.WEEK_OF_MONTH);
                weeklyTotal.put(week, weeklyTotal.getOrDefault(week, 0) + meal.price);
            }
        }
        System.out.printf("\n%d년 %d월 주차별 금액 정산:\n", year, month);
        System.out.println("------------------------------");
        for (Map.Entry<Integer, Integer> entry : weeklyTotal.entrySet()) {
            System.out.printf("%d주차: %,d₩\n", entry.getKey(), entry.getValue());
        }
        System.out.println("------------------------------");
    }

    public static int getTotalByMonth(int year, int month) {
        int total = 0;
        for (Meal meal : mealLog) {
            if (meal.year == year && meal.month == month) {
                total += meal.price;
            }
        }
        return total;
    }

    public static void printMealLog() {
        // System.out.println("\n======== 식사 기록 ========");
        // int total = 0;
        // for (int i = 0; i < mealLog.size(); i++) {
        //     Meal meal = mealLog.get(i);
        //     System.out.printf("[%d] %s\n", i, meal);
        //     total += meal.price;
        // }
        // System.out.println("------------------------------");
        // System.out.printf("총 합계: %,d₩\n", total);
        // System.out.println("============================\n");
        if (mealLog.isEmpty()) {
            System.out.println("\n보여줄 식사 기록이 없습니다\n");
        }else{
            System.out.println();
            for (Meal meal : mealLog) {
                System.out.println(meal);
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n-------------------- 식사 기록 관리 --------------------");
            System.out.println("1. 식사 기록하기");
            System.out.println("2. 식사 기록 확인하기");
            System.out.println("3. 식사 기록 수정하기");
            System.out.println("4. 식사 기록 삭제하기");
            System.out.println("5. 월간 금액 정산하기");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("연도 (YYYY): ");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.print("월 (MM): ");
                    int month = Integer.parseInt(scanner.nextLine());
                    System.out.print("일 (DD): ");
                    int day = Integer.parseInt(scanner.nextLine());
                    System.out.print("요일 (월, 화, 수, 목, 금, 토, 일): ");
                    String yoil = scanner.nextLine();
                    System.out.print("가게 이름: ");
                    String store = scanner.nextLine();
                    System.out.print("메뉴: ");
                    String menu = scanner.nextLine();
                    System.out.print("가격: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    addMeal(year, month, day, store, menu, price);
                    break;
                case 2:
                    printMealLog();
                    break;
                case 3:
                    System.out.print("수정할 기록의 연도 (YYYY): ");
                    int updateYear = Integer.parseInt(scanner.nextLine());
                    System.out.print("수정할 기록의 월 (MM): ");
                    int updateMonth = Integer.parseInt(scanner.nextLine());
                    System.out.print("수정할 기록의 일 (DD): ");
                    int updateDay = Integer.parseInt(scanner.nextLine());
                    updateMealByDate(updateYear, updateMonth, updateDay);
                    break;
                case 4:
                    System.out.print("삭제할 기록의 연도 (YYYY): ");
                    int deleteYear = Integer.parseInt(scanner.nextLine());
                    System.out.print("삭제할 기록의 월 (MM): ");
                    int deleteMonth = Integer.parseInt(scanner.nextLine());
                    System.out.print("삭제할 기록의 일 (DD): ");
                    int deleteDay = Integer.parseInt(scanner.nextLine());
                    deleteMealByDate(deleteYear, deleteMonth, deleteDay);
                    break;
                case 5:
                    System.out.print("연도 (YYYY): ");
                    int targetYear = Integer.parseInt(scanner.nextLine());
                    System.out.print("월 (MM): ");
                    int targetMonth = Integer.parseInt(scanner.nextLine());
                    getWeeklyBreakdown(targetYear, targetMonth);
                    int monthlyTotal = getTotalByMonth(targetYear, targetMonth);
                    System.out.printf("%d년 %d월 총 금액: %,d₩\n", targetYear, targetMonth, monthlyTotal);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }
}
