package a1122.hw;

public class Student1Test {
    public static void main(String[] args) {
        // 학생 객체 생성
        Student1 student1 = new Student1("홍길동", 20231234, 90, 85, 92);

        System.out.println("이름 : " + student1.getName());
        System.out.println("학번 : " + student1.getNum());
        System.out.println("국어 점수 : " + student1.getScore1());
        System.out.println("영어 점수 : " + student1.getScore2());
        System.out.println("수학 점수 : " + student1.getScore3());

        student1.changeScore1(92);
        student1.changeScore2(91);

        student1.scoreAvg();
    }
}

