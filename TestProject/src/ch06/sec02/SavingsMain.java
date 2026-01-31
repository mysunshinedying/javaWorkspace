package ch06.sec02;
import java.util.Scanner;
//나중에 한꺼번에 제출

public class SavingsMain {
    public static void main(String[] args) {
        Savings sa = new Savings();
        Scanner sc = new Scanner(System.in);
        int depositInput;

        sa.setName("홍길동");
        sa.setBalance(10000);
        System.out.println("예금주 : " + sa.getName());
        System.out.println("입금 전 잔액 : " + sa.getBalance());

        System.out.print("예금액 입력 : ");
        depositInput = sc.nextInt();

        sa.inputDeposit(depositInput);

        System.out.println("이자 : " + sa.getInterest());
        System.out.println("최종 잔액 : " + sa.getBalance());

    }
}
