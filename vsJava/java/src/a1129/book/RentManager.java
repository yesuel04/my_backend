package a1129.book;

import java.util.ArrayList;
import java.util.Scanner;

//숙소를 관리
public class RentManager {
    private ArrayList<Book> books;
    private ArrayList<Book> booked;

    public RentManager() {
        books = new ArrayList<>();
        booked = new ArrayList<>();
        // 초기숙소 추가
        books.add(new Book("bookA", "김바다", "979-11-6921-227-4"));
        books.add(new Book("bookB", "신용권", "753-51-6491-217-2"));
        books.add(new Book("bookC", "임재권", "549-11-6031-407-4"));

    }

    // 1. 대여 가능한 도서 목록 보기
    public void disAvailBook() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    // 2. 도서 대여하기
    public boolean booked(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && book.isAvailable()) {
                book.book();
                booked.add(book);
                return true;
            }
        }
        return false;
    }

    // 3. 대여한 도서 확인하기
    public void disBooked() {
        System.out.println(" - 대여한 도서 - ");
        for (Book book : booked) {
            System.out.println(book);
        }
    }

    // 4. 목록에 도서 추가하기
    public void addBook(String newTitle, String newAuthor, String newIsbns) {
        books.add(new Book(newTitle, newAuthor, newIsbns));
    }

    // 5. 목록에서 도서 삭제하기
    public void deleteBook(String dtitle) {
        boolean result = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(dtitle)) {
                if (book.isAvailable()) {
                    books.remove(book);
                    result = true;
                    break;
                } else {
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println(" - 삭제 O - ");
        } else {
            System.out.println(" - 삭제 X - ");
        }

    }

    // 6. 도서 정보 수정하기
    public void updateBook(String utitle) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Book newA = new Book();
        System.out.println(utitle);
        for (Book a : books) {
            i++;
            if (a.getTitle().equals(utitle)) {
                index = i - 1;
                newA = a;
            }
            System.out.println(a.getTitle().equals(utitle) + " " + a.getTitle() + " " + utitle);

        }
        if (index != -1) {
            System.out.print(" - 수정할 정보 선택 - \n 1. 도서 제목 \t 2. 저자 \t 3. ISBN \n >>");
            menu = sc.nextInt();
            sc.nextLine();
            while (flag) {
                switch (menu) {
                    case 1:
                        System.out.println("수정할 도서 제목");
                        System.out.print(" >> ");
                        newA.setTitle(sc.nextLine());
                        books.set(index, newA);
                        flag = false;
                        break;
                    case 2:
                        System.out.println("수정할 저자");
                        System.out.print(" >> ");
                        newA.setAuthor(sc.nextLine());
                        books.set(index, newA);
                        flag = false;
                        break;
                    case 3:
                        System.out.println("수정할 ISBN");
                        System.out.print(" >> ");
                        newA.setIsbn(sc.nextLine());
                        books.set(index, newA);
                        flag = false;
                        break;
                    default:
                        System.out.println(" - 1~3번 중에 입력하세요 - ");
                        break;
                }
            }
        } else {
            System.out.println(" - 찾는 도서가 없어서 수정 불가 - ");
        }

    }

    // 7. 도서 정보 상세 확인하기
    public void showBook(String stitle) {
        for (Book a : books) {
            if (a.getTitle().equalsIgnoreCase(stitle)) {
                System.out.println(a.toString());
            }
        }
    }

}
