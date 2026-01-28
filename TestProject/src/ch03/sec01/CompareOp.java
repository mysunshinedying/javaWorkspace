package ch03.sec01;

public class CompareOp {
    public static void main(String[] args) {
        // 비교 연산자
        // < > <= >= == !==
        // 다만, 문자열 비교는 == equala() 메서드를 권장함

        int num1  = 10;
        int num2 = 10;
        boolean result1 = (num1  == num2);
        boolean result2 = (num1  != num2);
        boolean result3 = (num1  <= num2);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

        char char1 = 'A';
        char char2 = 'B';
        char char3 = '가';
        char char4 = 'ㄱ';

        boolean result4 = (char1<char2);

        System.out.println("result4 : " + result4);
        System.out.println((int)char1);
        System.out.println((int)char2);
        System.out.println((int)char3);
        System.out.println((int)char4);


    }
}
