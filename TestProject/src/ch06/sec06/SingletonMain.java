package ch06.sec06;

public class SingletonMain {
    public static void main(String[] args) {
        //불가능함 - 생성자가 1개 있음, 해당 생성자는 클래스의 외부에서 접근 불가
        //Singleton sg1 = new Singleton();
        //Singleton sg2 = new Singleton();

        //private 선언 시
        //Singleton s1 = Singleton.singleton;
        //Singleton s2 = Singleton.singleton;

        //간접으로 객체 참조값 받아쓸 수 있도록 메서드 추가되어 있음
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        //s1,s2 동일 객체 참조

        if(s1 == s2) {
            System.out.println("동일 객체임");
        } else {
            System.out.println("다른 객체임");
        }

        if(s3 == s2) {
            System.out.println("동일 객체임");
        } else {
            System.out.println("다른 객체임");
        }
    }
}
