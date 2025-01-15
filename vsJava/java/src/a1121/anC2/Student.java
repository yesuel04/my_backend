package a1121.anC2;

public class Student {
    String name;
    int age;
    String stdNo;
    String major;

    public Student(){
        this("이름없음", 1, "00000000", "없음");

    }

    public Student(String name, int age, String stdNo, String major) {
        this.name = name;
        this.age = age;
        this.stdNo = stdNo;
        this.major = major;
    }

    public void study(String subject) {
        System.out.println(subject + "를 공부합니다.");
    }

    public double getAverage(int score1, int score2) {
        double average = 0.0;
        average = (double) (score1+score2) / 2;
        return average;
    }

    public double getAverage(int score1, int score2, int score3) {
       double average = 0.0;
       average = (double) (score1+score2+score3) / 3;
       return average;
    }

    public double getAverage(int[] scores) {
        double average = 0.0;
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        average = (double) sum/scores.length;
        return average;
    }

}
