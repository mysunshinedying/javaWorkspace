package ch10;

public class TryCatch {
    public static void main(String[] args) {
        // try ~ catch
        int[] arr = {1,2,3};
        try {
            //System.out.println(arr[5]);
            System.out.println("test");

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 범위 벗어남");
        }

        System.out.println("프로그램 종료합니다");
    }
}
