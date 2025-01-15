package a1129.book;

//도서 클래스
public class Book {
    private String title; // 도서 제목
    private String author; // 도서 저자
    private String isbn; // 도서 ISBN
    private boolean available; //예약가능한지

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book() {}

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void book() {
        this.available = false;
    }
    
    @Override
    public String toString() {
        return "도서 제목 : " + title + ", 저자 : " + author + ", ISBN : " + isbn
                + ", 예약여부 : " + (available ?  "예약가능" : "예약불가능");
    }

  
}
