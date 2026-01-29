package ch05.sec01;
import java.util.Scanner;

public class ArrayInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("숫자 입력 : ");
        for(int i = 0; i < nums.length; i++){
            System.out.printf("nums[%d] : ", i); //%는 결정되지 않은 format 문자 기호, 실행중 값이 결정. %d: 정수, %f: 실수
            nums[i] = sc.nextInt();
        } //for문 종료

        System.out.println("\n 입력된 값 출력");
        for(int i = 0; i < nums.length; i++){
            System.out.printf("nums[%d] = %d\n", i, nums[i]); //%는 결정되지 않은 format 문자 기호, 실행중 값이 결정. %d: 정수, %f: 실수
        } //for문 종료
        sc.close();
    }
}
