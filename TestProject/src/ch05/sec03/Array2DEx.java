package ch05.sec03;

import java.util.Scanner;

public class Array2DEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] quiz = {{"chair","의자"},{"computer","컴퓨터"},{"integer","정수"}};

        for (int i = 0; i <quiz.length; i++) {

            System.out.printf("Q%d.%s의 뜻은?: ", i + 1, quiz[i][0]);
            String answer = sc.next();
            if(answer.equals(quiz[i][1])){
                System.out.println("정답입니다.");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n", quiz[i][1]);
            }
        } //for문 종료
        
        sc.close(); //sc.close 누락으로 01-30 AM10:49 수정
    }
}