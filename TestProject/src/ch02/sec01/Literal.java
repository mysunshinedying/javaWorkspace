package ch02.sec01;

public class Literal {
    public static void main(String[] args) {
        // 리터럴 - 실제 값의 총칭(저장된 값)
        // 정수/실수/문자/문자열/논리
        int score = 95;
        double average = 88.5;
        char familyName = '김'; // 문자 ''
        String name = "홍길동"; // string은 "" 엄밀하게는 리터럴X
        boolean result = true; //논리 리터럴

        System.out.println(score);
        System.out.println(average);
        System.out.println(familyName);
        System.out.println(name);
        System.out.println(result);

        //변수 사용범위Scope는 기본적으로 {}(블록)
    }
}
