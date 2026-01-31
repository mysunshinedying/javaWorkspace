package ch05.sec03;

public class Array2D {
    public static void main(String[] args) {
        int[][] a = new int[3][4]; //2차원 배열 참조 시작
        a = null; //2차원 배열 참조 끝

        int[][] a1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        char [][] b = {{'a','b','c'}, {'d','e','f'}};

        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}

        };

        //배열 index는 0부터 시작 2차원 배열 접근 : 배열[행Index][열Index]
        System.out.println(score[0][0]);
        //2차원 배열 length 속성 값
        System.out.println(score.length); //바깥 배열(행의 수)
        System.out.println(score[0].length); //해당 행의 원소수
        System.out.println(score[0]);
        System.out.println(score); //2차원이므로 [[로 뜸

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]); //각 행의 시작 주소(가상)
            
        }

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d%n",i,j,score[i][j]);
            }
            System.out.println();
            
        }
    }
}
