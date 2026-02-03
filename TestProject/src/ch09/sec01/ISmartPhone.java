package ch09.sec01;

//smartphone이 반드시 포함해야 하는 기능 나열 - 프로젝트 관리자가 작성해서 
public interface ISmartPhone {
    public void sendCall(); //전화걸기
    public void receiveCall(); //전화받기
    public void sendSMS(); //문자 전송
    public void receiveSMS(); //문자받기
}
