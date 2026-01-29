package ch04.sec02;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("숫자 입력 : ");
        num = sc.nextInt();

        do {
            System.out.print("다시 입력 : ");
            num = sc.nextInt();
        } while(num != 7);

        System.out.print("7 입력. 종료");
        sc.close();
    }
}
