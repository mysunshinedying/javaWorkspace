package ch09.sec02;

public class RCMain {
    public static void main(String[] args) {
        //인터페이스 참조 변수 : 다형성
        IRemoteControl rc = null;

        // TV 객체를 인터페이스 참조 변수 대입
        rc = new TV();
        rc.turnOn();
        rc.setVolume(100);
        rc.setMute(true);
        rc.turnOff();

        TV tv = new TV();
        tv.turnOn();
        tv.setVolume(-50);
        tv.setMute(true);
        tv.setMute(false);
        tv.turnOff();

        //정적 메서드 사용
        IRemoteControl.changeBattery();

        rc = new Audio();
        rc.setMute(true);
        rc.setMute(false);

        //다중 인터페이스 구현 클래스 객체를 각각 인터페이스 참조 변수에 대입
        ISearchable sb = null;
        rc = new SmartTelevision();
        sb = new SmartTelevision();


        //IRemoteControl로 접근 가능한 메서드
        //rc 인터페이스에 포함된 추상메서드와 default 메서드만 접근이 가능
        //search()는 다른 인터페이스(ISearchable)의 추상메서드라 불가능.
        //rc.search("bbbb");
        sb.search("www.naver.com");
        //sb.turnOff();


    }
}
