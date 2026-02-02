package ch08.sec01;

public class Child extends Parent {
    private int c;

    public void setChild(){
        c = 20;
    }
    public void showChild(){
        System.out.println("부모 클래스 p2 : " + p2);
        showParent(); //상속받아 사용 가능
        System.out.println("자식 클래스 c : "+ c);

    }
}
