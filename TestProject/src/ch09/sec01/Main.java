package ch09.sec01;

public class Main {
    public static void main(String[] args) {
        //인터페이스 활용에 해당하는 예제
        SamsungPhone sp = new SamsungPhone();
        sp.sendCall();

        Iphone ip = new Iphone();
        ip.sendCall();

        //인터페이스 참조 변수 : 해당 인터페이스를 구현, 객체를 참조할 수 있음
        ISmartPhone isp = new SamsungPhone(); //구현 메서드 사용 가능
        isp.sendCall();

        ISmartPhone iIp = new Iphone();
        iIp.sendCall();

        isp = new Iphone();
        iIp = new SamsungPhone();
    }
}
