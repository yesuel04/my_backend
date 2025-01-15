package a1209.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, "S001"));
        students.add(new Student("Bob", 22, "S002"));
        students.add(new Student("Charlie", 19, "S003"));

        Student s4 = new Student();
        s4.setName("Tom");
        s4.setAge(25);
        s4.setStudentId("S004");
        students.add(s4);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n--------------- 학생 관리 프로그램 ---------------");
            System.out.println(" 1. 학생 정보 추가하기 ");
            System.out.println(" 2. 학생 리스트 보기 ");
            System.out.println(" 3. 학생 정보 수정하기 ");
            System.out.println(" 4. 학생 정보 삭제하기 ");
            System.out.println(" 5. 프로그램 나가기 ");
            System.out.print(" 번호 선택하기 >> ");
            int choose = scan.nextInt();
            scan.nextLine();
            
            switch (choose) {
                case 1:
                    //방법1
                    System.out.println("\n학생 정보를 입력하세요.");

                    System.out.print("\n이름을 입력하세요 >> ");
                    String newName = scan.next();
                    
                    System.out.print("\n나이를 입력하세요 >> ");
                    int newAge = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.print("\n학생 아이디를 입력하세요 >> ");
                    String newId = scan.next();
                    
                    students.add(new Student(newName, newAge, newId));
                    System.out.println("\n학생 추가 완료");
                    break;

                    //방법2
                    // System.out.println("\n학생 정보를 입력하세요.");
                    // Student s5 = new Student();

                    // System.out.print("\n이름을 입력하세요 >> ");
                    // s5.setName(scan.nextLine());

                    // System.out.print("\n나이를 입력하세요 >> ");
                    // s5.setAge(scan.nextInt());

                    // System.out.print("\n학생 아이디를 입력하세요 >> ");
                    // s5.setStudentId(scan.nextLine());

                    // students.add(s5);
                    // System.out.println("\n학생 추가 완료");
                    // break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("\n보여줄 학생 리스트가 없음\n");
                    }else{
                        System.out.println();
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    System.out.print("\n수정할 학생의 아이디를 입력해주세요 >> ");
                    String searchId = scan.nextLine();
                    boolean found = false;

                    for (Student student : students) {
                        if (student.getStudentId().equals(searchId)) {
                            System.out.println("\n수정할 학생 이름 >> ");
                            student.setName(scan.nextLine());
                            System.out.println("\n수정할 학생 나이 >> ");
                            student.setAge(scan.nextInt());
                            scan.nextLine();
                            System.out.println("\n학생 수정 성공");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                    break;
                case 4:
                    System.out.println("\n삭제할 학생 아이디를 입력해주세요 >> ");
                    String deleteId = scan.nextLine();
                    found = false;

                    for (Student student : students) {
                        if (student.getStudentId().equals(deleteId)) {
                            students.remove(student);
                            System.out.println("해당 학생 정보를 삭제했습니다.");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                    break;
                case 5:
                    System.out.println("\n프로그램 종료\n");
                    scan.close();
                    // System.exit(0);
                    return;
                default:
                    System.out.println("\n다시 입력해주세요.\n");
            }
        }

    }
}
