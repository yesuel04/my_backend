package a1202.hak5;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // StudentDTO student1 = new StudentDTO(0,"테스트1",15,100,90,80);
        // StudentDTO student2 = new StudentDTO(1,"테스트2",17,90,90,70);
        // StudentDTO student3 = new StudentDTO(2,"테스트3",19,80,80,80);
        // ArrayList<StudentDTO> arrList = new ArrayList<>();
        // arrList.add(student1);
        // arrList.add(student2);
        // arrList.add(student3);

        // System.out.println(arrList);

        StudentDAO test = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 삭제");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 학생정보 수정");
			System.out.println("5. 학생 목록 보기");
			System.out.println("6. 파일로 저장하기");
			System.out.println("7. 학생정보 파일 불러오기");
			System.out.println("0. 종료");
            System.out.print(">>");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                choice = -1;
            }

            if(choice == 1){
                test.userInsert();
            }else if(choice == 2){
                test.userDelete();
            }else if(choice == 3){
                test.userSelect();
            }else if(choice == 4){
                test.userUpdate();
            }else if(choice == 5){
                test.printAll();
            }else if(choice==6){
                try{ 
                 test.dataSave();  
                }catch(Exception e){
                 e.printStackTrace();
                }  
            }else if(choice==7){
                test.dataLoad();
            }else if(choice == 0){
                System.out.println(" < 종료 > ");
                sc.close();
                System.out.println(0);
            }else{
                System.out.println(" - 입력 오류 - ");
            }
        }
    }
}
