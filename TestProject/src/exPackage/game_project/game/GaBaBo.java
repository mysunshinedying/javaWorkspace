package exPackage.game_project.game;

import java.util.Scanner;

public class GaBaBo {
    private static final String[] handSelect = { "", "가위", "바위", "보" }; //가위바위보 출력용
    Scanner sc = new Scanner(System.in);
    int answer;
    int computerAnswer;
    String result;
    String again;

    public void playingGaBaBo(){
        System.out.println("********************************************");
        System.out.println("            가위바위보 게임");
        System.out.println("가위 바위 보 게임 : 1. 가위, 2. 바위, 3. 보");

        do {
            System.out.println("===============================");
            System.out.print("번호 입력 : ");
            answer = sc.nextInt();
            if (answer < 1 || answer > 3) {
                System.out.println("1~3 중 입력해 주세요.");
                continue;
            }

            versusCalculator(answer);
            versusResult();

            System.out.print("계속 하시겠습니까? (y) : ");
            again = sc.next();
            if(!again.equals("y")){
                System.out.println("게임을 종료합니다.");
            }
        } while(again.equals("y"));

    }
    private void versusCalculator(int answer) {
        computerAnswer = (int) (Math.random() * 3) + 1;

        if (answer == computerAnswer) {
            result = "비겼습니다!";
        } else if ((answer == 1 && computerAnswer == 3) ||
                (answer == 2 && computerAnswer == 1) ||
                (answer == 3 && computerAnswer == 2)) {
            result = "당신이 이겼습니다^^";
        } else {
            result = "졌습니다!";
        }
    }

    public void versusResult(){
        System.out.println(result);
        System.out.println("컴퓨터는 " + handSelect[computerAnswer] + "입니다.");
    }

}
