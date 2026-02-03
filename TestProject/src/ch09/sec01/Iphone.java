package ch09.sec01;

public class Iphone implements ISmartPhone {
    String name;

    public Iphone(){
        name = "아이폰";
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
