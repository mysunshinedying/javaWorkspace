package ch06.sec04;

public class BookThisMethod {
    String title;
    String author;
    int price;

    BookThisMethod(){
        this("미정","미정");
        price = 0;
    }

    BookThisMethod(String title, String author){
        this.title = title;
        this.author = author;
    }

    BookThisMethod(String title, int price){

        this.title = title;
        this.price = price;

    }
}
