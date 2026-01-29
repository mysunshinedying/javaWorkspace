package ch05.sec01;
import java.util.Scanner;

public class ArrayInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = new String[5];

        System.out.println("이름 입력 : ");
        for(int i = 0; i < nums.length; i++){
            System.out.printf("nums[%s] : ", i); //%는 결정되지 않은 format 문자 기호, 실행중 값이 결정. %d: 정수, %f: 실수, %s 문자열
            nums[i] = sc.next();
        } //for문 종료

        System.out.println("\n 입력된 값 출력");
        for(int i = 0; i < nums.length; i++){
            System.out.printf("nums[%d] = %s\n", i, nums[i]); //%n === \n과 같은 의미의 포맷문자
        } //for문 종료

        sc.close();
    }
}
