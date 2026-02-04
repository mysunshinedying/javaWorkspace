package ch09.book_interface;

public class BookDTO {
    String bookCode; //책 청구번호
    String bookName; //책 이름
    String bookAuthor; //책 저자
    String bookPublisher; //출판사
    String bookClass; //분류법
    String bookYear; //책 발행년도

    public BookDTO( String bookCode, String bookName, String bookAuthor, String bookPublisher, String bookClass, String bookYear) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookClass = bookClass;
        this.bookYear = bookYear;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "(" + getBookClass() + ") 도서명:" + getBookName() + ", 저자:" + getBookAuthor() + ", 출판사:" + getBookPublisher() + ", 발행년도:" + getBookYear() + ", 청구번호:" + getBookCode();
    }
}
