package ch08.sec04;

public class Computer extends Calculator {
    //메서드 재정의 = 정밀도 위해 Math.PI 이용
    @Override
    double areaCircle(double r) {
        System.out.println("Calculator 객체 areaCircle 실행");
        return Math.PI*r*r;
    }


}
