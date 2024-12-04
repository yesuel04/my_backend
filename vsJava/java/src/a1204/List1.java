package a1204;

import java.util.ArrayList;
import java.util.List;

class Student{
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
    
    public Student() {}

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

public class List1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Alex", 20));
        studentList.add(new Student(201, "Brown", 28));
        studentList.add(new Student(301, "Chris", 25));

        System.out.println("StudentList 출력 : ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\n특정 인덱스 1번의 Student 정보");
        Student student = studentList.get(1);
        String name = studentList.get(1).getName();
        System.out.println(name);

        System.out.println("\n모든 학생의 이름 출력");
        for(Student s : studentList){
            System.out.println(s.getName());
        }
    }
}
