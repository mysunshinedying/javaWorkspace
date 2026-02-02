package ch06.sec05;

public class ShareMain {
    public static void main(String[] args) {
        //static 활용 공유변수 사용
        Share s1, s2;
        s1 = new Share();
        s1.set(5); //인스턴스와 스태틱 전부 변경

        System.out.println("s1의 a : " + s1.showA());
        System.out.println("s1의 staticA : " + s1.showStaticA());

        s2 = new Share();
        s2.set(100);

        System.out.println("s2의 a : " + s2.showA());
        System.out.println("s2의 staticA : " + s2.showStaticA());

        System.out.println("share 클래스의 staticA : " + Share.showStaticA()); //static의 경우 클래스 통해 부르는것이 원칙


    }
}
