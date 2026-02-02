package ch06.sec04;

public class BookMain {
    public static void main(String[] args) {
        BookThisMethod book = new BookThisMethod();
        book = new BookThisMethod("java","홍길동");
        book = new BookThisMethod("java",19_000);
    }
}
