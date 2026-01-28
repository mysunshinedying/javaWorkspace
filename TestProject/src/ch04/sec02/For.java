package ch04.sec02;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }

        //누적 연산
        int sum, i;
        sum = 0;
        for(i = 1; i<=100; i+=2){ //반복이 종료되는 시점 조건이 false가 되어야 하니까 100보다 큰 값-> i = 101;
            sum += i;
        }
        System.out.println("1~" + (i - 1) + "의 홀수합 : " + sum);

        for(int m = 2; m <= 9; m++){
            System.out.println("***" + m + "단 ***");
            for(int n = 1; n <= 9; n++){
                System.out.println(m + " * " + n + "=" + (m * n));
            }
        }
    }
}
