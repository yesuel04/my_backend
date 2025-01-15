package a1118;

public class Array2 {
    public static void main(String[] args) {
        int[] scores = {80,90,75};
        int sum = 0;
        for(int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        int avg = 0;
        avg = sum/3;
        System.out.println("평균 : " + avg);

        printItem(new int[] {83,90,87});

    }
    public static void printItem(int[] scores){
        for(int i=0;i<3;i++){
            System.out.println("scores[" + i + "] : "+ scores[i]);
        }
    }
}
