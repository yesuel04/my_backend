package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MealPlanner {
    public static void main(String[] args) {

        ArrayList<Meal> mealLog = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("\n-------------------- 식사 기록 관리 --------------------");
            System.out.println("1. 식사 기록하기");
            System.out.println("2. 식사 기록 확인하기");
            System.out.println("3. 식사 기록 수정하기");
            System.out.println("4. 식사 기록 삭제하기");
            System.out.println("5. 월간 금액 정산하기");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    Planner.addMeal(mealLog);
                    break;
                case 2:
                    Planner.viewMeals(mealLog);
                    break;
                case 3:
                    Planner.updateMeal(mealLog);
                    break;
                case 4:
                    Planner.deleteMeal(mealLog);
                    break;
                case 5:
                    Planner.monthTotal(mealLog);
                    break;
                case 0:
                    System.out.println("\n [ 종료 ] \n");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("\n [ 잘못 입력되었습니다. ] \n");
            }
        }
    }
    
}


//식사 기록표

//어떤 가게에서, 무엇을 먹었는지, 가격이 어떤지 기록.
//날짜(년 월 일) 정보를 받아 기록.
//기록 누적.
//월간 총 금액 계산.