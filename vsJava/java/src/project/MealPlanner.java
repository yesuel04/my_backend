package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MealPlanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Meal> meals = new ArrayList<>();  // 식사 기록을 저장할 ArrayList
        int choice;

        // 메뉴 출력
        do {
            System.out.println("\n===== 식사 기록 관리 =====");
            System.out.println("1. 식사 기록 추가");
            System.out.println("2. 식사 기록 조회");
            System.out.println("3. 식사 기록 수정");
            System.out.println("4. 식사 기록 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기

            switch (choice) {
                case 1: // 추가
                    Planner.addMeal(meals, scanner);
                    break;
                case 2: // 조회
                    Planner.viewMeals(meals);
                    break;
                case 3: // 수정
                    Planner.updateMeal(meals, scanner);
                    break;
                case 4: // 삭제
                    Planner.deleteMeal(meals, scanner);
                    break;
                case 5: // 종료
                    System.out.println("프로그램 종료.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        } while (choice != 5);

        scanner.close();
    }
        
}


//식사 기록표

//월화수목금
//어떤 가게에서, 무엇을 먹었는지, 가격이 어떤지 기록
//매주(5일) 총 금액 계산
