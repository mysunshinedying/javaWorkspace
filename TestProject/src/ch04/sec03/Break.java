package ch04.sec03;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            //무한반복일 경우 내부 코드에서 종료해야함

            System.out.println(i);
            i += 3;
            if(i > 20)
                break;
        } //while 종료

        System.out.println("break에 의해 반복 종료!!");
    }
}
