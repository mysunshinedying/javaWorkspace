package ch03.sec01;

public class OverflowEx {
    public static void main(String[] args) {

        //overflow 예제
        int x = 1_000_000;
        int y = 1_000_000;

        int z = x * y; //int 벗어남
        long l = (long)x * (long)y;
        //x와 y를 long으로 형변환하지 않을 경우 이미 overflow가 일어난다.

        System.out.println(z);
        System.out.println(l);

        //Nan과 Infinity 예제
        //System.out.println(10 / 0); // / by zero 오류

        System.out.println(10 / 0.0); //Infinity 출력

        //System.out.println(10 % 0); // / by zero 오류
        System.out.println(10 % 0.0); //Nan 출력
    }
}
