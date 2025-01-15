package a1122;

public class StudentText {
    public static void main(String[] args) {
        Student park = new Student(2123456789, "박");
        Student Kim = new Student(2123456764, "김");
        Student Lee = new Student(2123436479, "이");
        System.out.printf("Student 객체의 수 : %d", Student.count);
    }
}
class Student{
    static int count = 0;

    int id;
    String name;

    public Student(int id, String name){
        Student.count++;
        this.id = id;
        this.name = name;
    }
}
