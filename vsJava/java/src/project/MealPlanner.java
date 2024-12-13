package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MealPlanner {
    public static void main(String[] args) {

        ArrayList<Meal> meals = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("\n-------------------- 식사 기록 관리 --------------------");
            System.out.println("1. 식사 기록하기");
            System.out.println("2. 식사 기록 확인하기");
            System.out.println("3. 식사 기록 수정하기");
            System.out.println("4. 식사 기록 삭제하기");
            System.out.println("5. 주간 총 금액 확인");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    Planner.addMeal(meals, scan);
                    break;
                case 2:
                    Planner.viewMeals(meals);
                    break;
                case 3:
                    Planner.updateMeal(meals, scan);
                    break;
                case 4:
                    Planner.deleteMeal(meals, scan);
                    break;
                case 5:
                    Planner.WeeklyTotal(meals);
                    break;
                case 0:
                    System.out.println(" [ 종료 ] ");
                    break;
                default:
                    System.out.println(" [ 잘못 입력되었습니다. ] ");
            }
        }
    }
    
}


//식사 기록표

//어떤 가게에서, 무엇을 먹었는지, 가격이 어떤지 기록.
//일주일 단위로 기록.
//4주가 한달.
//매주(5일) 총 금액 계산.
//기록 누적.
//누적 기록 확인(달마다 기록이 나뉨)


//ms 빙

// import java.util.ArrayList;
// import java.util.Scanner;

// class MealRecord {
//     String restaurant;
//     String food;
//     double price;

//     MealRecord(String restaurant, String food, double price) {
//         this.restaurant = restaurant;
//         this.food = food;
//         this.price = price;
//     }
// }

// public class MealTracker {
//     static ArrayList<MealRecord> mealRecords = new ArrayList<>();

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             System.out.println("1. 식사 기록 추가");
//             System.out.println("2. 주별 총 금액 보기");
//             System.out.println("3. 누적 기록 보기");
//             System.out.println("4. 종료");
//             System.out.print("선택하세요: ");
//             int choice = scanner.nextInt();
//             scanner.nextLine(); // 개행 문자 처리

//             if (choice == 1) {
//                 addMealRecord(scanner);
//             } else if (choice == 2) {
//                 showWeeklyTotal();
//             } else if (choice == 3) {
//                 showAccumulatedRecords();
//             } else if (choice == 4) {
//                 break;
//             } else {
//                 System.out.println("잘못된 선택입니다.");
//             }
//         }
//         scanner.close();
//     }

//     public static void addMealRecord(Scanner scanner) {
//         System.out.print("가게 이름: ");
//         String restaurant = scanner.nextLine();
//         System.out.print("음식: ");
//         String food = scanner.nextLine();
//         System.out.print("가격: ");
//         double price = scanner.nextDouble();
//         scanner.nextLine(); // 개행 문자 처리
//         mealRecords.add(new MealRecord(restaurant, food, price));
//         System.out.println("식사 기록이 추가되었습니다.");
//     }

//     public static void showWeeklyTotal() {
//         double weeklyTotal = 0;
//         for (MealRecord record : mealRecords) {
//             weeklyTotal += record.price;
//         }
//         System.out.println("이번 주 총 금액: " + weeklyTotal);
//     }

//     public static void showAccumulatedRecords() {
//         System.out.println("누적 기록:");
//         for (MealRecord record : mealRecords) {
//             System.out.println("가게: " + record.restaurant + ", 음식: " + record.food + ", 가격: " + record.price);
//         }
//     }
// }



//챗지피티

// import java.util.ArrayList;
// import java.util.Scanner;

// class Meal {
//     private String storeName;   // 가게 이름
//     private String menu;        // 메뉴
//     private double price;       // 가격

//     public Meal(String storeName, String menu, double price) {
//         this.storeName = storeName;
//         this.menu = menu;
//         this.price = price;
//     }

//     public String getStoreName() {
//         return storeName;
//     }

//     public String getMenu() {
//         return menu;
//     }

//     public double getPrice() {
//         return price;
//     }
// }

// public class MealTracker {
//     private static final ArrayList<ArrayList<Meal>> monthlyMeals = new ArrayList<>();
//     private static double totalAmountForMonth = 0;

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int weekCount = 0;

//         // 4주를 관리하기 위한 배열 생성
//         for (int i = 0; i < 4; i++) {
//             monthlyMeals.add(new ArrayList<>());
//         }

//         while (true) {
//             System.out.println("\n==== 식사 기록 관리 ====");
//             System.out.println("1. 식사 기록 추가");
//             System.out.println("2. 주간 금액 계산");
//             System.out.println("3. 누적 기록 보기");
//             System.out.println("4. 종료");
//             System.out.print("옵션을 선택하세요: ");
//             int option = scanner.nextInt();

//             switch (option) {
//                 case 1:
//                     addMealRecord(scanner, weekCount);
//                     break;
//                 case 2:
//                     calculateWeeklyTotal(weekCount);
//                     break;
//                 case 3:
//                     showMonthlyRecord();
//                     break;
//                 case 4:
//                     System.out.println("프로그램을 종료합니다.");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("잘못된 옵션입니다. 다시 선택하세요.");
//             }

//             // 매 5일마다 주 변경
//             if ((weekCount + 1) % 5 == 0) {
//                 weekCount++;
//             }
//         }
//     }

//     private static void addMealRecord(Scanner scanner, int weekCount) {
//         System.out.print("가게 이름을 입력하세요: ");
//         String storeName = scanner.next();
//         System.out.print("메뉴를 입력하세요: ");
//         String menu = scanner.next();
//         System.out.print("가격을 입력하세요: ");
//         double price = scanner.nextDouble();

//         // 해당 주에 기록 추가
//         Meal newMeal = new Meal(storeName, menu, price);
//         monthlyMeals.get(weekCount).add(newMeal);

//         totalAmountForMonth += price;  // 누적 금액
//         System.out.println("식사 기록이 추가되었습니다.");
//     }

//     private static void calculateWeeklyTotal(int weekCount) {
//         double weeklyTotal = 0;
//         ArrayList<Meal> mealsForWeek = monthlyMeals.get(weekCount);

//         for (Meal meal : mealsForWeek) {
//             weeklyTotal += meal.getPrice();
//         }

//         System.out.println("주 " + (weekCount + 1) + "의 총 금액: " + weeklyTotal + "원");
//     }

//     private static void showMonthlyRecord() {
//         double total = 0;

//         for (int i = 0; i < 4; i++) {
//             double weeklyTotal = 0;
//             System.out.println("\n==== " + (i + 1) + "주 기록 ====");
//             for (Meal meal : monthlyMeals.get(i)) {
//                 System.out.println(meal.getStoreName() + " - " + meal.getMenu() + " - " + meal.getPrice() + "원");
//                 weeklyTotal += meal.getPrice();
//             }
//             System.out.println("주 " + (i + 1) + "의 총 금액: " + weeklyTotal + "원");
//             total += weeklyTotal;
//         }

//         System.out.println("\n=== 전체 누적 금액 ===");
//         System.out.println("한 달 동안의 총 금액: " + total + "원");
//     }
// }
