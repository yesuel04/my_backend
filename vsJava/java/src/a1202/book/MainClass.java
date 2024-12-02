package a1202.book;

import java.util.Scanner;

import a1202.book.BookDAO;

public class MainClass {
    public static void main(String[] args) {
        BookDAO b = new BookDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1. 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 조회");
			System.out.println("5. 종료");
            System.out.print(">>");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                choice = -1;
            }

            if(choice == 1){
                b.addBook();
            }else if(choice == 2){
                b.deleteBook();
            }else if(choice == 3){
                b.updateBook();
            }else if(choice == 4){
                b.searchBook();
            }else if(choice == 5){
                System.out.println(" < 종료 > ");
                sc.close();
                System.out.println(0);
            }
        }
    }
}
