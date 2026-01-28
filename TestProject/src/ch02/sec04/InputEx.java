package ch02.sec04;
import java.util.Scanner;
//5시 5분에 일괄제출

public class InputEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int year;
        double average;
        char grade;

        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("학년 입력 : ");
        year = sc.nextInt();
        System.out.print("점수 입력 : ");
        average = sc.nextDouble();
        System.out.print("학점 입력 : ");
        grade = sc.next().charAt(0);

        System.out.println("--------------");

        System.out.println("이름 : " + name);
        System.out.println("학년 : " + year);
        System.out.println("점수 : " + average);
        System.out.println("학점 : " + grade);
    }
}
