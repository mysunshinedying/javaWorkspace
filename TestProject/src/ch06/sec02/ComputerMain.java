package ch06.sec02;

public class ComputerMain {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = {1, 2, 3, 4};

        //인수로 배열 참조변수 전달
        myCom.sum1(values1);


        myCom.sum2(1,2,3); //기본값 전달 - 여러 개의 인수를 전달하면 메서드에서 전달된 인수를 배열로 생성해서 사용
        myCom.sum2(1,2);
        myCom.sum2(1,2,3,4,5);

        System.out.println(myCom.sum1(values1));

        System.out.println(myCom.sum2(1,2,3));
        System.out.println(myCom.sum2(1,2));
        System.out.println(myCom.sum2(1,2,3,4,5));
    }
}
