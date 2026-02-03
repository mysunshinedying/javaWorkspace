package ch09.sec01;

//이클립스의 경우 source-override/implements Methods
//intelliJ의 경우 ctrl+O 및 ctrl+I로 사용 가능
public class SamsungPhone implements ISmartPhone {
    String name;

    public SamsungPhone(){
        name = "삼성폰";
    }

    @Override
    public void sendCall() {
        System.out.println(name + "으로 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {

    }

    @Override
    public void sendSMS() {

    }

    @Override
    public void receiveSMS() {

    }
}
