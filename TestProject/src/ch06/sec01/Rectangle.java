package ch06.sec01;

import java.util.Scanner;

public class Rectangle {
    //사용자로부터 데이터를 입력받을 때 사용
    //면적 계산용으로 사용
    private int width;
    private int height;

    //필드 보호를 위해 필드에 값을 저장하는 메서드
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 길이 입력 : ");
        width = sc.nextInt();
        System.out.print("세로 길이 입력 : ");
        height = sc.nextInt();
    }


    public void area() {
        System.out.println("사각형 면적 : " + width * height);
    }
    //생성자 함수는 개발자가 명시적으로 표현하지 않으면
    //자바가 자동으로구성
}
