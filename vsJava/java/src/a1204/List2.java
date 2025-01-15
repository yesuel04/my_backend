package a1204;

import java.util.ArrayList;
import java.util.List;

class Student2 {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student2() {
    }

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

public class List2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Alex", 20));
        studentList.add(new Student(102, "Brown", 28));
        studentList.add(new Student(103, "Chris", 25));

        System.out.println("StudentList 출력 : ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\n특정 인덱스 1번의 Student 정보");
        Student student = studentList.get(1);
        String name = studentList.get(1).getName();
        System.out.println(name);

        System.out.println("\n모든 학생의 이름 출력");
        for (Student s : studentList) {
            System.out.println(s.getName());
        }

        // 데이터 추가
        // 104,D,23

        System.out.println("\n새로운 학생 한 명 추가");
        studentList.add(new Student(104, "Dana", 23));
        printList(studentList);

        System.out.println("\n특정 학생 변경");
        updateStudent(studentList, 102, "Bein", 31);
        printList(studentList);

        System.out.println("\n특정 학생 삭제");
        deleteStudent(studentList, 103);
        printList(studentList);

        System.out.println("\n특정 학생 검색");
        Student searchStudent = findStudentById(studentList, 107);
        System.out.println(searchStudent != null ? searchStudent : "학생을 찾을 수 없습니다.");
    }

    private static Student findStudentById(List<Student> studentList, int id) {
        for (Student student : studentList) {
            if(student.getId() == id ){ 
                return student;
            }
        }
        return null;
    }

    private static void deleteStudent(List<Student> studentList, int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("학생 ID " + id + "를 삭제했습니다.");
                return;
            }
        }
        System.out.println("학생 ID " + id + "를 찾을 수 없습니다.");
    }

    private static void printList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private static void updateStudent(List<Student> studentList, int id, String newName, int newAge) {
        // 리스트를 돌면서 id가 같은 것을 찾아서 이름과 나이를 변경.
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("학생 ID " + id + "정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println("학생 ID " + id + "를 찾을 수 없습니다.");
    }

}
