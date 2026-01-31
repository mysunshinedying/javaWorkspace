package ch05.sec02;
import java.util.Scanner;

public class Score_ex {
    public static void main(String[] args) {
        int student = 0;
        int selected;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------");
            System.out.print("선택> ");
            selected = sc.nextInt();

            if(selected == 1){ //학생수
                System.out.print("학생수> ");
                student = sc.nextInt();
                if(student > 0) {
                    scores = new int[student];
                } else {
                    student = 0;
                  System.out.println("학생 수는 0명 이상이어야 합니다.");
                }

            } else if (selected == 2) { //점수입력
                if(student == 0) {
                    System.out.println("학생 수를 먼저 지정해주세요.");
                }  else {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("scores[%d]> ", i);
                        scores[i] = sc.nextInt();
                    }
                }

            } else if (selected == 3) { //점수리스트
                if(scores == null){
                    System.out.println("점수를 먼저 입력해주세요.");
                }  else {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("scores[%d]: %d%n", i, scores[i]);

                    }
                }
            } else if (selected == 4) { //분석
                if(scores == null){
                    System.out.println("점수를 먼저 입력해주세요.");
                }  else {
                    int max = scores[0];
                    int totalScore = 0;
                    double average;
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                        totalScore += scores[i];
                    }
                    average = (double) totalScore / scores.length;

                    System.out.println("최고점수: " + max);
                    System.out.println("평균점수: " + average);
                }


            } else if (selected == 5) { //종료

                System.out.println("프로그램 종료");

            } else {
                System.out.println();
            }


        } while(selected != 5);

        sc.close();
    }
}


