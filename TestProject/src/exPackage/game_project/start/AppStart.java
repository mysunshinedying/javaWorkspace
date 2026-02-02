package exPackage.game_project.start;

import java.util.Scanner;
import exPackage.game_project.info.AppInfo;
import exPackage.game_project.game.GaBaBo;
import exPackage.game_project.game.Guess;


public class AppStart {
    public static void main(String[] args) {
        int selectMenu;
        Scanner sc = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("★★게임에 오신 것을 환영합니다^^");
        do {
        System.out.println("********************************************");
        System.out.println("            메뉴             ");
        System.out.println("-------------------------------------------");
        System.out.println("1. 애플리케이션 정보");
        System.out.println("2. 가위바위보 게임");
        System.out.println("3. 숫자 알아맞히기 게임");
        System.out.println("4. 종료");
        System.out.println("-------------------------------------------");

            System.out.print("메뉴 번호 입력 : ");
            selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1:
                     AppInfo info = new AppInfo();
                     info.showAppInfo();
                    break;
                case 2:
                    GaBaBo gababo = new GaBaBo();
                    gababo.playingGaBaBo();
                    break;
                case 3:
                    Guess guess = new Guess();
                    guess.guessingNumber();
                    break;
                case 4:
                    System.out.println("********************************");
                    System.out.println("            종료합니다!");
                    System.out.println("********************************");
                    break;
                default:
                    System.out.println("********************************");
                    System.out.println("           다시 선택");
                    System.out.println("********************************");
            }
        } while(selectMenu != 4);

        sc.close();

    }
}
