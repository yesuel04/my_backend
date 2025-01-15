package a1128.hak;

import java.util.Scanner;

import a1128.sort.InsertionSort;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 학생 수 입력받기
        System.out.print("학생 수 입력 : ");
        int a = scan.nextInt();
        scan.nextLine(); // 개행문자소비

        // 학생 배열 생성
        Student[] students = new Student[a];

        // 학생 정보 입력
        for (int i = 0; i < a; i++) {
            System.out.print("학생 이름 : ");
            String name = scan.nextLine();
            System.out.print("학생 나이 : ");
            int age = scan.nextInt();
            System.out.print("학생 번호 : ");
            int id = scan.nextInt();
            scan.nextLine();

            students[i] = new Student(name, age, id);
        }

        InsertionSort(students);

        System.out.println("정렬된 학생 목록 : ");
        for(Student student : students){
            System.out.println(student);
        }
    }

    private static void InsertionSort(a1128.hak.Student[] students) {
        int n = students.length;
        for(int i=1; i<n; i++){
            Student cStudent = students[i];
            int j = i-1;
            while (j>=0 && students[j].getName().compareTo(cStudent.getName())>0) {
                students[j+1] = students[j];
                j--;
            }
            students[j+1] = cStudent;
        }
    }
}

class Student {
    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + id + "]";
    }

}
