package a1120;

import java.util.Scanner;

public class HomeWork04{
    public static void main(String[] args) {
        boolean run = true;

        int studentNum = 0;
        int[] scores = null;
        Scanner scan = new Scanner(System.in);
        
        while(run){
            System.out.println("------------------------------------------------------------");
            System.out.println("1 학생수 | 2 점수입력 | 3 점수리스트 | 4 분석 | 5 종료");
            System.out.println("------------------------------------------------------------");
            
            System.out.print("선택 > ");
            int selectNo = Integer.parseInt(scan.nextLine());
            // 줄단위로 문자처럼 입력받고 숫자로 변환.
            if(selectNo == 1){
                System.out.print("학생 수 > ");
                studentNum = Integer.parseInt(scan.nextLine());
                scores = new int[studentNum];
            }else if(selectNo == 2){
                for(int i=0; i<scores.length; i++){
                    System.out.print("scores["+i+"] > ");
                    scores[i] = Integer.parseInt(scan.nextLine());
                }
            }else if(selectNo == 3){
                for(int i=0; i<scores.length; i++){
                    System.out.println("scores["+i+"] > " + scores[i]);
                }
            }else if(selectNo == 4){
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i=0; i<scores.length; i++){
                    max = (max < scores[i])? scores[i] : max;
                    sum = sum + scores[i];
                }
                avg = (double) sum / studentNum;
                System.out.println("최고 점수 : " + max);
                System.out.printf("평균 점수 : %.2f" , avg);
                System.out.println("");
            }else if(selectNo == 5){
                run = false;
            }else{
                System.out.println("유효하지 않은 선택 입니다. 다시 시도해주세요.");
            }

            // catch(NumberFormatException e){
            //     System.out.println("숫자를 입력하세요 : ");
            // }

        }
        System.out.println("프로그램 종료");
    }
}
