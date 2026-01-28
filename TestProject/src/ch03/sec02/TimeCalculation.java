package ch03.sec02;
import java.util.Scanner;
//13:50 일괄제출

public class TimeCalculation {
    public static void main(String[] args) {
        int totalTime, seconds, minutes, hours;

        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력(초) : ");

        totalTime = sc.nextInt();

        hours = totalTime / 3600; //hours = totalTime을 3600으로 나눈 결과
        minutes = (totalTime % 3600) / 60; //minutes = totalTime을 3600으로 남긴 나머지를 60으로 나눈다
        seconds = totalTime % 60; // seconds = totalTime을 60으로 나눈 나머지를 사용한다.
        //※ 정수 연산이므로 소수점은 버림처리되므로 별도 처리는 필요하지 않다.

        System.out.println(totalTime + "는 " + hours + "시간, " + minutes + "분, " + seconds + "초입니다.");
        sc.close();

    }
}
