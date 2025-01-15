package a1202.book;

import java.util.ArrayList;
import java.util.Scanner;

import a1202.book.BookDTO;

public class BookDAO {

    private static ArrayList<BookDTO> bookList;
    Scanner sc = new Scanner(System.in);

    BookDAO(){
        bookList = new ArrayList<BookDTO>();

        bookList.add(new BookDTO(0, "Java Programming", "Author A", 2020));
        bookList.add(new BookDTO(1, "Python Basics", "Author B", 2019));
        bookList.add(new BookDTO(2, "Data Structures", "Author C", 2018));
    }

    // 1. 도서 추가
    private void insert(BookDTO bb) {
        bookList.add(bb);
    }

    public void addBook() {
        BookDTO bb = new BookDTO();
        bb.setId(bookList.size());

        System.out.println("<도서 추가>");

        System.out.print("도서 ID : ");
        bb.setId(sc.nextInt());
        System.out.print("도서 제목 : ");
        bb.setTitle(sc.next());
        System.out.print("저자 : ");
        bb.setAuthor(sc.next());
        System.out.print("출판연도 : ");
        bb.setYear(sc.nextInt());

        insert(bb);
        System.out.println("도서가 추가 되었습니다.");
    }

    // 2. 도서 삭제
    private void delete(int index) {
        bookList.remove(index);
    }

    public void deleteBook() {
        System.out.println(" < 도서 삭제 > ");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 도서가 없습니다.");
        } else {
            int id = bookList.get(index).getId();
            delete(index);
            System.out.println("도서ID "+id + "를 삭제했습니다.");
        }
    }

    private int searchIndex() {
        int index = -1;
        System.out.println(" - 도서ID를 입력해 주세요 - ");
        System.out.print(">>");
        int id = sc.nextInt();
        for (int i = 0; i < bookList.size(); i++) {// slist 는 arrayList배열이름과 입력한 이름비교
            if (bookList.get(i).getId() == id) {
                index = i; // 같은데이터가 있으면 i 를 index에 대입
                break;
            }
        }
        return index;
    }

    // 3. 도서 수정
    private void update(int index, BookDTO bb) {
        bookList.set(index, bb);
    }

    public void updateBook() {
        System.out.println(" < 도서 수정 > ");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 도서가 없습니다.");
        } else {
            BookDTO bb = new BookDTO(); // 빈객체를 하나 만든다.
            bb.setId(bookList.get(index).getId()); // 기존 인덱스 번호에 해당하는 리스트에 있는 아이디
            bb.setTitle(bookList.get(index).getTitle());
            bb.setAuthor(bookList.get(index).getAuthor());

            System.out.println(" 도서ID " + bookList.get(index).getId() + "의 정보 수정");
            System.out.print("도서 제목 : ");
            bb.setTitle(sc.next());
            System.out.print("저자 : ");
            bb.setAuthor(sc.next());
            System.out.print("출판연도 : ");
            bb.setYear(sc.nextInt());

            update(index, bb);
        }
    }

    // 4. 도서 조회
    public void searchBook() {
        System.out.println(" 도서ID \t\t 도서 제목 \t\t 저자 \t\t 출판연도 \n"
                + "---------------------------------------------------");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
    }

}
