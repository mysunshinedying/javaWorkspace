package ch03.sec01;

import java.awt.*;

public class increaseOp {
    public static void main(String[] args) {
        //증가감 연산자
        int x = 10;
        int y = 10;
        int z;

        //증가감 연산은 단독일 경우에는 위치가 관계 X
        System.out.println("----------------------");
        x++;
        ++x;
        System.out.println(x); //12

        System.out.println("----------------------");
        y--;
        --y;
        System.out.println(y); //8

        //대입연산자와 사용할 경우
        System.out.println("x++ ----------------------");
        z = x++;
        System.out.println("z = " + z); //12
        System.out.println("x = " + x); //13

        System.out.println("++x ----------------------");
        z = ++x;
        System.out.println("z = " + z); //14
        System.out.println("x = " + x); //14

        //다른 연산자와 같이 사용(+ 연산과 같이 사용)
        System.out.println("----------------------");
        z = ++x + y++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
