package ch08.sec01;

public class Iinheritance {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.setChild(); //sub 클래스 메서드 호출
        ob.setParent(); //super 클래스 메서드 호출
        ob.showChild();

        Parent pb = new Parent();
        pb.setParent();
        pb.showParent();
    }
}
