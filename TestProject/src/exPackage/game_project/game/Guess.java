package exPackage.game_project.game;

import java.util.Scanner;

public class Guess {
    int guessAnswer = (int)(Math.random() * 10) + 1;
    Scanner sc = new Scanner(System.in);

    public void guessingNumber() {
        guessAnswer = (int) (Math.random() * 10) + 1;
        System.out.println("********************************************");
        System.out.println("            숫자 알아맞히기 게임");
        System.out.println("-------------------------------------------");
        System.out.println("어떤 숫자일까요? 알아 맞혀보세요^^ (1~10)");
        System.out.print("숫자 입력 : ");
        int userAnswer = sc.nextInt();

        System.out.println("-------------------------------------------");

        while (guessAnswer != userAnswer) {
            System.out.print("아닙니다. 다시 맞혀보세요^^ 다시 입력 : ");
            userAnswer = sc.nextInt();
        }
        System.out.println("드디어 맞혔습니다~ 나의 숫자는 " + guessAnswer + "입니다.");
    }


}
