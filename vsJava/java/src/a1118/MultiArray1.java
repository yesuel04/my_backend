package a1118;

public class MultiArray1 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        for(int i=0; i<mathScores.length; i++){
            for(int k=0;k<mathScores[i].length;k++){
                System.out.println("mathScores["+i+"]["+k+"] : " + mathScores[i][k]); 
            }
        }
        System.out.println();

        mathScores[0][0] =80;
        mathScores[0][1] =83;
        mathScores[0][2] =85;
        mathScores[1][0] =86;
        mathScores[1][1] =90;
        mathScores[1][2] =77;

        for(int i=0; i<mathScores.length; i++){
            for(int k=0;k<mathScores[i].length;k++){
                System.out.println("mathScores["+i+"]["+k+"] : " + mathScores[i][k]); 
            }
        }
        System.out.println();

        int totalStudent = 0;

        int totalMathSum = 0;
        for(int i=0; i<mathScores.length; i++){
            totalStudent = totalStudent + mathScores[i].length;
            for(int k=0;k<mathScores[i].length;k++){
                totalMathSum += mathScores[i][k];
            }
        }
        System.out.println("합 : "+totalMathSum);
        double avg = (double) totalMathSum/totalStudent;
        System.out.println("평균 : "+ avg);
    }
}
