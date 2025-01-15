package a1114;

public class Condi1 {
    public static void main(String[] args) {
        int score = 85;
        char grade = score>90 ? 'A' : score>80 ? 'B' : 'C';
        System.out.println(score + ":" + grade);
    }
}
