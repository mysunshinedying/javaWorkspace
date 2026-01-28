package ch02.sec03;

public class OptionsPromoEx {
    public static void main(String[] args) {
        //연산 중 발생하는 자동 형변환
        byte byteValue1 = 10;
        byte byteValue2 = 20;

        //byte byteValue3 = byteValue1 + byteValue2; //+ 연산은 int가 기본
        //이에 따라 byte 변수에 대입은 불가능(int로 자동형변환되었기 때문에)

        int intValue = byteValue1 + byteValue2;
        System.out.println(intValue);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2; // int>char이므로(byte가) 형변환 불가능

        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 : " + intValue2);
        System.out.println("유니코드 출력문자 : " + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4; // 정수 / 정수 -> 정수(int)
        System.out.println(intValue4);

        //연산결과가 실수여야 할때는 실수연산 진행해야 함
        //intValue4 = intValue3 / 4.0; //정수 / 실수 -> 정수가 실수로 형변환 되면서 실수 / 실수 -> 실수(double)
        double doubleValue = intValue3 / 4.0;
        System.out.print(doubleValue);
        System.out.println(doubleValue);
        System.out.print(doubleValue);

    }
}
