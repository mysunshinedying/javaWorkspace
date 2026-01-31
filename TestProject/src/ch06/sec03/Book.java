package ch06.sec03;

public class Book {
    String title;
    String author;
    int price;

    public Book(){
        this("미정", "미정", 0);
        //this()는 클래스 내의 다른 생성자 호출
    }

    public Book(String t, String a, int p){
        title = t;
        author = a;
        price = p;
    }

    public void getBook(){

    }
}
