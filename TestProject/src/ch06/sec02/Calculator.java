package ch06.sec02;

import javax.swing.*;

public class Calculator {
    //클래스의 구성 요소 : 필드 + 메서드(없어도 됨)
    void powerOn(){
        //접근제한자 생략, 리턴값 없음
        System.out.println("전원을 켭니다.");
    }
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    double divide(int x, int y){
        return (double)x / (double) y;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    public static void main(String[] args) {
        //main은 static이므로(독립적이므로) Calculator class 내부여도 객체 생성 후 사용해야 함
        Calculator myCalc = new Calculator();
        myCalc.powerOn();
        int result1 = myCalc.plus(5,10);

        System.out.println(myCalc.plus(5,10));

        byte x = 10; byte y = 4;
        double result2 = myCalc.divide(x,y);
        System.out.println(result1 + result2);

        myCalc.powerOff();
    }
}
