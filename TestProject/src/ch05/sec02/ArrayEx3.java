package ch05.sec02;
import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {

        int [] arrayNum = new int[10];
        int [] arrayCount = new int[10];

        for(int i = 0; i < 10; i++){
            int num = (int)(Math.random() * 10);
            arrayNum[i] = num;
            System.out.print(num);
        }

        System.out.println();

        for(int i = 0; i < 10; i++) {
            int arrayCountIndex = arrayNum[i]; //arrayNum의 배열 내용을 하나의 변수로 선언
            arrayCount[arrayCountIndex]++; //arrayCountIndex 배열의 위치(index)의 값을 증가(int Array의 initial 은 0)
        }

        //전부 다 값을 입력한 후 출력해야 안정적(수정함)
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i + "의 개수: " + arrayCount[i]);
        }


    }
}
