package ch05.sec01;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int num;
        int[] arr; //배열에 저장된 요소의 타입을 선언 시 결정

        //자바는 동적 할당이 되지 않음
        //arr의 배열 크기는 12byte (int 4 * 3)
        //arr[0]의 주소가 100번지라면 int 크기만큼 건너뛰면 arr[1]이 있어야함
        arr = new int[3];

        //배열 선언(2가지)
        int[] num1; //해당 배열의 index에 접근하면 실제 값이 존재
        double[] average;
        String[] name; //해당 배열의 index에 접근하면 문자열 참조하는 주소

        //형식2
        int num2[];
        double average2[];
        String name2[];

        int a[] = new int[5];
        int[] c;
        c = new int[5];

        //int[5] test; //선언하며 크기 결정은 불가능
        //int test1[6];

        int[] a1 = new int[5]; //initial 0
        double[] d1 = new double[2]; //initial 0.0
        boolean[] b1 = new boolean[5]; //initial false
        String[] s = new String[5]; //initial null

        //byte, short, int: 0, long: 0L
        //float:0.0F
        //참조 타입:null
        //char:'\u0000' -> 유니코드 null 문자

        //배열선언 할당하면서 초기화 진행 방법
        int[] i1 = { 1, 2, 3, 4, 5 };
        String[] nations = { "korea", "japan", "china" };
        int score[] = new int[]{ 90, 80, 55, 60 };

        int[] test2;
        //test2 = { 1, 2, 3, 4, 5 }; // {} 이용한 할당 및 초기화는 선언과 동시에만 사용할 수 있다.
        //int score1[] = new int[4]{ 90, 80, 55, 60 }; //[]에 요소크기를 결정하는 것은 초기화 진행시에는 불가능
        test2 = new int[] { 1, 2, 3, 4, 5 }; //명시적 할당 후에 {} 사용 가능

        //길이가 0인 배열
        int[] score2 = new int[0];
        int[] score3 = new int[] {};
        int[] score4 = {};

        System.out.println(score); //가상주소 출력
        //java에서 @는 주소를 표현하는 기호임
        //java 주소의 첫문자가 [면 배열 참조 주소 의미
        //[[의 경우 2차원 배열의 의미

        System.out.println(score[0]);

        String[] flowers = { "해바라기", "장미", "진달래" };

        for(int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i] + " ");
        }

        System.out.println();

        //Array 클래스에 to String()을 사용하면 전체 배열값을 반환받을 수 있음
        System.out.println(Arrays.toString(flowers));

        //배열의 크기 : length 속성
        System.out.println("flowers 배열의 크기 : " + flowers.length);
        System.out.println("길이가 없는(0인) 배열의 length 속성 : " + score2.length);


    }
}
