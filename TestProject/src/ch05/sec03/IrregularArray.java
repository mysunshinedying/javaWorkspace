package ch05.sec03;

public class IrregularArray {
    public static void main(String[] args) {
        int [][] a = new int[4][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];

        char b[][] = {{'a'},{'b','c'},{'d','e'}};//new char [3]

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("score[%d][%d] = %c%n",i,j,b[i][j]);
            }
            System.out.println();

        }
    }
}
