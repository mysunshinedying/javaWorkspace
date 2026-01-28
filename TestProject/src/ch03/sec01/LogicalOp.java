package ch03.sec01;

public class LogicalOp {
    public static void main(String[] args) {
        int charCode = 'A';

        System.out.println((charCode >= 65) & (charCode <= 90));
        System.out.println((charCode >= 65) && (charCode <= 90));
        System.out.println(true & true);

        if((charCode >= 65) && (charCode <= 90)) { //unicode 65~90 범위는 영문 대문자에 해당
            System.out.println("대문자군요");
        }

        if((charCode >= 97) && (charCode <= 122)) { //unicode 97~122 범위는 영문 소문자에 해당
            System.out.println("소문자군요");
        }

        if(!(charCode < 48) && !(charCode > 57)) { //unicode 48~57 범위는 숫자
            System.out.println("0~9 숫자군요");
        }

        int value = 6;
        if((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수로군요");
        }

        if((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수로군요");
        }

    }
}
