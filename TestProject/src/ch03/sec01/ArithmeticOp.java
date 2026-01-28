package ch03.sec01;
import java.util.Scanner;
import  java.text.DecimalFormat;

public class ArithmeticOp {
    public static void main(String[] args) {
        // 산술 연산자: 나머지 연산자(%)
        //나머지 연산자 규칙: 나눈 나머지 값은 0 ~ 나눈값 -1 범위에서 나타남

        System.out.println("나머지 : " + 10 % 3);

        //사용자 입력: scanner 사용
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); //생성자 호출시 초기값(인수)로 포맷 전달

        int kor, eng, math, total;
        float average;

        System.out.print("국어 점수 입력 :");
        kor = sc.nextInt();
        System.out.print("수학 점수 입력 :");
        math = sc.nextInt();
        System.out.print("영어 점수 입력 :");
        eng = sc.nextInt();

        total = kor + eng + math;
        average = total / 3.0F; // 실수는 더블이 기본 데이터타입 → float으로 수정해줌

        System.out.println("========================");
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + df.format(average));
        sc.close(); //인스턴스 종료
    }
}

