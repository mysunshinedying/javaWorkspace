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
            int winNum = lotto[num];
            lotto[num] = lotto[i];
            lotto[i] = winNum;
        }

        int[] result = Arrays.copyOf(lotto, 6);

        System.out.println(Arrays.toString(result));

    }
}
