package ch04.sec02;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*while(1==1) {
           무한반복
        }*/

        int i,sum;
        i = 0;
        sum = 0;
        while(i<100){ //짝수의 합이 102가 되면 종료
            sum += i;
            i += 2;
        }
        System.out.println("i값 : " + i + " sum값 : " + sum);

        //

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("숫자 입력 : ");
        num = sc.nextInt();

        while(num != 7) {
            System.out.print("다시 입력 : ");
            num = sc.nextInt();
        }

        System.out.print("7 입력. 종료");
        sc.close();


    }
}
