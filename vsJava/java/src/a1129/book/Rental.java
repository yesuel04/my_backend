package a1129.book;

import java.util.Scanner;

public class Rental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentManager manager = new RentManager();
        boolean flag = true;
        while (flag) {
            System.out.println("\n [ 도서 대여 시스템 ] ");
            System.out.println("1. 대여 가능한 도서 목록 보기"); 
            System.out.println("2. 도서 대여하기"); 
            System.out.println("3. 대여한 도서 확인하기");
            System.out.println("4. 목록에 도서 추가하기");
            System.out.println("5. 목록에서 도서 삭제하기");
            System.out.println("6. 도서 정보 수정하기");
            System.out.println("7. 도서 정보 상세 확인하기");
            System.out.println("8. 시스템 종료"); 
            System.out.print("원하는 작업을 번호 선택 > ");
            int choice = sc.nextInt();
            sc.nextLine(); //메모리에 있는 개행문자 삭제

            switch (choice) {
                case 1:
                    System.out.println(" [ 대여 가능한 도서 목록 보기 ] ");
                    manager.disAvailBook();
                    break;
                case 2:
                    System.out.println(" [ 도서 대여하기 ] ");
                    System.out.println("대여하려는 도서의 제목을 입력하세요 >> ");
                    String bookTitle = sc.nextLine();
                    if(manager.booked(bookTitle)){
                        System.out.println("도서가 성공적으로 대여되었습니다.");
                    }else{
                        System.out.println("도서가 대여 불가능 하거나 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    System.out.println(" [ 대여한 도서 확인하기 ] ");
                    manager.disBooked();    
                    break;
                case 4:
                    System.out.println(" [ 목록에 도서 추가하기 ] ");
                    System.out.print("추가하려는 도서 제목 입력 \n 도서 제목 >> ");
                    String newTitle = sc.nextLine();
                    System.out.print("저자 >>");
                    String newAuthor = sc.nextLine();
                    System.out.print("ISBN >>");
                    String newIsbns = sc.nextLine();
                    sc. nextLine();
                    System.out.println("추가하려는 도서 " + newTitle);
                    if(newTitle.equals("")){ 
                        System.out.print("추가하려는 도서 제목 입력 \\n" + //
                                                        " 도서 제목 >> ");
                        newTitle= sc.nextLine();
                    }
                    manager.addBook(newTitle, newAuthor, newIsbns);
                    System.out.println(" - 도서 추가 완료 - ");
                    break;
                case 5:
                    System.out.println(" [ 목록에서 도서 삭제하기 ] ");
                    System.out.print("삭제하려는 도서 제목 입력 >> ");
                    String dtitle = sc.nextLine();
                    if(dtitle.equals("")){
                        System.out.print("삭제하려는 도서 제목 재입력 \n 제목 >> ");
                        dtitle = sc.nextLine();
                    }    
                    manager.deleteBook(dtitle);
                    System.out.println(" - 도서 삭제 완료 - ");
                    break;
                case 6:
                    System.out.println(" [ 도서 정보 수정하기 ] ");
                    System.out.print("수정하려는 도서 제목 입력 >> ");
                    String utitle = sc.nextLine();
                    System.out.println(utitle);  
                    if (utitle.equals("")) {
                        System.out.print("수정하려는 도서 제목 재입력 \n 제목 >> ");
                        newTitle = sc.nextLine();
                    }
                    manager.updateBook(utitle);
                    System.out.println(" - 도서 수정 완료 - ");
                    break;
                case 7:
                    System.out.println(" [ 도서 정보 상세 확인하기 ] ");
                    System.out.print("도서 제목 입력 >> ");
                    String stitle = sc.nextLine();
                    if (stitle.equals("")) {
                        System.out.print("상제 확인하려는 도서의 제목을 재입력 \n 제목 >> ");
                        newTitle = sc.nextLine();
                    } 
                    manager.showBook(stitle);
                    System.out.println(" - 도서 정보 상세 확인 완료 - ");
                    break;  
                case 8:
                    System.out.println(" [ 종료 ] ");
                    flag = false;
                    sc.close();
                    System.exit(0); 
                    break;
                default:
                    System.out.println(" - 재입력해주세요 - ");
                    break;
            }
        }
        
        
    }
}
