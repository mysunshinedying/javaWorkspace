package ch09.sec02;

public interface IRemoteControl {
    //상수 필드 선언: interface의 멤버 필드는 public static final이 컴파일 될 때 자동 삽입
    //필드 구성 시 static 상수로 구성
    int MAX_VOLUME = 10; // = public static final int MAX_VALUE
    int MIN_VOLUME = 0;

    //추상 메서드 선언 : abstract 선언하여도 자동으로 추상처리
    //메서드 원형만 표현
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트 메서드 선언 : 실행 블럭이 있는 메서드(구현 클래스가 소유하게 되는 메서드)
    //default 키워드 반드시 필요
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리 합니다.");
        } else {
            System.out.println("무음 해제 합니다.");
        }
    }

    //정적 메서드 선언 : 인터페이스 통해 호출 되는 메서드(static)
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다");
    }

}
