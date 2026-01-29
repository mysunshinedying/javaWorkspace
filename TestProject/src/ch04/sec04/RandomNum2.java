package ch04.sec04;
import java.util.Random;

public class RandomNum2 {
    public static void main(String[] args) {
        //Random 클래스는 기본객체가 아니므로 import
        //Math.Random의 경우 기본객체

        Random r = new Random();

        for(int i = 1; i <= 10; i++){
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
