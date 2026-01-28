package ch02.sec01;

public class Final {
    public static void main(String[] args) {
        //상수: final 예약어 → final은 상수로 사용 가능
        //상수일 경우 대문자로 쓰는 것을 권장(약속함)
        // float : 실수타입 명 → float은 실수 뒤에 f를 붙여야한다.
        // double : 실수타입 명 → float보다 더 메모리를 차지함. 예약 문자 없으면 double형
        final float PI = 3.14f;
        double radius = 10;
        double circleArea = 0;

        circleArea = radius * radius * PI;

        System.out.println("원의 면적 = " + circleArea);
    }
}
