package a1118;

public class Array1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        int[] scores = {80,90,75};
        int num = 0;
        num = scores[0] + scores[1] + scores[2];
        System.out.println("총합 : " + num);
        int avg = 0;
        avg = num/3;
        System.out.println("평균 : " + avg);
    }
}
