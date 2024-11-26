package a1126.Hak5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("학생 이름을 입력하세요. : ");
        String name = scan.nextLine();
        System.out.println("학생의 학번을 입력하세요. : ");
        String studentID = scan.nextLine();
        System.out.println("학생 성적을 입력하세요. : ");
        int score = scan.nextInt();

        Grade grade = new Grade(name, studentID, score);

        System.out.println(grade.toString());

        scan.close();
    }
}
