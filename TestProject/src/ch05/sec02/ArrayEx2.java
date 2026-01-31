package ch05.sec02;
import java.util.Arrays;
import java.util.Random;

public class ArrayEx2 {
    public static void main(String[] args) {
        int [] lotto = new int[45];
        for (int i = 0; i < 45; i++) {
            lotto[i] = i + 1;
        }
        Random r = new Random();

        for (int i = 0; i < 45; i++) {
            int num = r.nextInt(45);
            int winNum = lotto[num]; //랜덤 넘버를 뽑는다
            lotto[num] = lotto[i]; //해당 넘버는 lotto[i]의 값으로 재할당된다
            lotto[i] = winNum; //그 후 lotto[i]는 랜덤넘버로 대체 된다.
        }

        int[] result = Arrays.copyOf(lotto, 6);

        System.out.println(Arrays.toString(result));

    }
}
