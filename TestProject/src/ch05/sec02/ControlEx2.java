package ch05.sec02;
import java.util.Scanner;

//제출은 제출하라 하시면 됨

public class ControlEx2 {
    public static void main(String[] args) {
        int balance = 0;
        int money = 0;
        int selected;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------");
            System.out.print("선택>");
            selected = sc.nextInt();

            switch (selected){
                case 1:
                    System.out.print("예금액>");
                    money = sc.nextInt();
                    balance += money;
                    break;
                case 2:
                    System.out.print("출금액>");
                    money = sc.nextInt();
                    if(balance >= money) {
                        balance -= money;
                    } else {
                        System.out.println("잔고가 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println();
            }


        } while(selected != 4);


        sc.close();
    }
}
