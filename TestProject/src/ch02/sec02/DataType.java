package ch02.sec02;

public class DataType {
    public static void main(String[] args) {
        //dataType
        //기본타입 정수/실수/문자/논리
        //정수: byte/short/int/long
        //실수: float/double
        //문자: char
        //논리: boolean
        //데이터 타입에 따라 사용하는 메모리 크기가 다름
        // 메모리 크기 최소 단위는 bit(0 or 1)
        //bit 8개 => 1byte(데이터 처리 최소단위) -> 256개의 표현

        char a = 'a'; //just 문자A
        char b = '\u0041'; //문자 A의 유니코드
        char c = 65; //문자 A의 아스키코드값

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        // int 정수타입 - 4byte의 정수값 표현
        int num = 10; //리터럴에 정수 표현 기호 필요하지 않음(기본)

        //long = 8byte의 정수값 표현

        long num2 =10;
        //long longValue = 100010001000100; //리터럴이 표현범위를 벗어남
        long longValue2 = 100010001000100L;

        System.out.println("============================");
        byte byteValue = 10; //1byte 00000110
        short shortValue = 1000; //2byte 정수
        int intValue = 2100100100; //4byte 정수
        long longVal = 100010001000100L;

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longVal);

        //실수 타입: float / double
        //float: 리터럴 사용시 F 추가
        //double: 실수의 기본 타입

        float average = 88.5F;
        double doubleValue = 0.1234567890123456789;
        float floatValue = 0.1234567890123456789F;

        System.out.println("============================");
        System.out.println(doubleValue);
        System.out.println(floatValue);

        // 지수 표현하기: e기호 사용
        //가수부e지수부 형태로 사용

        int var1 = 3_000_000;
        double var2 = 3e6;
        float var3 = 3e6F;
        double var4 = 3e-6;
        double var5 = 3e-2;

        System.out.println("============================");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4); //println문의 포맷을 바꾸지 않으면 소수점 이하가 길면 지수표현이 됨
        System.out.println(var5);



        //참조형:String
        //기본처럼 보이지만 참조입니다

        String name = "홍길동";

        // "홍길동"은 문자열형 리터럴
        // name은 문자열형 변수

    }
}
