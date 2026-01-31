package ch06.sec02;

public class Computer {
    //매개 변수로 배열 전달 받아 배열의 요소값을 모두 더한 결과를 반환
    //배열 참조 객체이므로 참조값 전달됨
    public int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length ; i++) {
            sum += values[i];
        }
        return sum;
    }

    //매개 변수로 값의 리스트를 전달받음
    //... : 전달된 값에 따라 자동으로 배열로 생성
    int sum2(int ... values){
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;

    }
}
