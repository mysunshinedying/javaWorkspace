package ch06.sec07;

public class FinalMain {
    public static void main(String[] args) {
        Final fi1 = new Final("홍길동", "1234");
        fi1.name = "김길동";
        //fi1.ssn = "5678"; //ssn은 상수이므로 대입연산 불가능함

        System.out.print(fi1.nation); //접근하여 data 사용가능
    }
}
