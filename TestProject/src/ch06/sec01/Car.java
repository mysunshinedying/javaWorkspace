package ch06.sec01;

public class Car {
    //클래스의 구성 요소
    //멤버 필드(속성): 객체를 표현하는 정보 저장
    String carNo = "11가 1234";
    String carName;
    String carMaker;
    int carYear;
    int carCC;

    //멤버 메서드:객체의 기능을 표현
    //자동차 정보를 출력하는 메서드
    public void showCarInfo(){
        System.out.println("차량 번호 :" + carNo);
    }
}
