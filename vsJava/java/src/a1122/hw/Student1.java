package a1122.hw;

// 문제 1: 학생 클래스 만들기
// 문제 설명:

// 학생의 이름, 학번, 세 과목의 점수를 저장하는 Student 클래스를 생성하세요.
// 각 변수에 대한 private 접근 제한자를 사용하여 정보를 보호하고, getter와 setter 메소드를 통해 값을 조회하고 변경하도록 하세요.
// 생성자를 이용하여 학생 정보를 초기화하고, 평균 점수를 계산하는 메소드를 추가하세요.

// 학생 정보 출력
// 학생 국어 점수 수정 95
// 평균 점수 출력해보세요

public class Student1 {
    private String name;
    private int num;
    private int score1;
    private int score2;
    private int score3;
    private double sum;
    private double avg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public Student1(String name, int num, int score1, int score2, int score3) {
        this.name = name;
        this.num = num;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void changeScore1(int newScore) {
        score1 = newScore;
        System.out.println("수정된 국어 점수는 " + score1);
    }

    public void changeScore2(int newScore) {
        score2 = newScore;
        System.out.println("수정된 영어 점수는 " + score2);
    }

    public void scoreAvg() {
        double sum = (double) score1 + score2 + score3;
        double avg = sum / 3;
        System.out.printf("전체 평균 점수는 %.2f", avg);
        return;
    }
    
}
