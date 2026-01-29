package ch04.sec03;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            if(i % 2 != 0)
                continue;
            System.out.println(i);
            /*
               continue; 조건 없이 사용 불가
            System.out.println(i);
             */
        }
    }

}
