package a1118;

import java.util.Scanner;

public class MultiArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] scores = new int [3][3];
        for(int i=0; i<scores.length; i++){
            System.out.printf("학생 %d의 국어, 영어, 수학 점수를 입력하세요 : " , i+1);
            for(int j=0;j<scores[i].length;j++){
                scores[i][j] = scan.nextInt();
            }
        }

        //각 학생의 총점과 평균 
        for(int i=0; i<scores.length; i++){
            int sum = 0;
            for(int j=0;j<scores[i].length; j++){
                sum += scores[i][j];
            }
            double avg = (double) sum / scores[i].length;
            System.out.printf("학생 %d의 총점 : %d, 평균 : %.2f\n", i+1, sum, avg);
        }

        //모든 학생의 총점과 평균
        int totalSum = 0;
        int totalSub = 0;
        for(int i=0; i<scores.length; i++){
            for(int j=0;j<scores[i].length;j++){
                totalSum += scores[i][j];
            }
        }
        totalSub = (scores[0].length) * (scores.length);
        double totalAvg = (double) totalSum/totalSub;
        System.out.printf("학생의 전체 총점 : %d, 평균 : %.2f\n", totalSum, totalAvg);

    }
}
