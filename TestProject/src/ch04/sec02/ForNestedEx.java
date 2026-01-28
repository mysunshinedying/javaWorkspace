package ch04.sec02;

public class ForNestedEx {
    public static void main(String[] args) {
        for (int i = 2; i<=9; i++){
            for(int m = 1; m <= 9; m++){
                System.out.print(i + "x" + m + "=" + (i * m) + "\t");
            }
            System.out.println();//공백
        }
    }
}
