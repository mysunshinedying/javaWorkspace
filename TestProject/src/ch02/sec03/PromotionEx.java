package ch02.sec03;

public class PromotionEx {
    public static void main(String[] args) {
        //작은것 → 큰것이라면 자동형변환 가능(byte수로 확인)
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;

        System.out.println("가의 유니코드 : " + intValue);

        intValue = 500;
        long longValue = intValue;
        System.out.println(longValue);

        intValue = 500;
        double doubleValue = intValue;
        System.out.println(doubleValue);

        //intValue = doubleValue; double(8byte) > int(4byte) 이므로 자동 불가


    }
}
