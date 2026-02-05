package ch10;

public class ArrayIndexOutOfBoundsEx {
    //main 호출 시 값 전달: program argument 설정함
    //Eclipse의 경우 Run - Run Configurations - 값을 전달할 클래스 선택하여 Argument 탭 - Program Argument를 설정
    public static void main(String[] args) {
        // 배열 범위 벗어나면 발생하는 오류
        /*String data1 = args[0]; //java.lang.ArrayIndexOutOfBoundsException
        String data2 = args[1];

        System.out.println("args[0]" + data1);
        System.out.println("args[1]" + data2);*/

        if(args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println("args[0]" + data1);
            System.out.println("args[1]" + data2);
        } else {
            System.out.println("ArrayIndexOutOfBoundsException 오류가 발생합니다");
        }
    }
}
