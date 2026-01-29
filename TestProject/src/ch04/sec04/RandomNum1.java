package ch04.sec04;

public class RandomNum1 {
    public static void main(String[] args) {
        //Math.random()

        for(int i = 1; i <= 10; i++){
            int num = (int)(Math.random() * 10);
            System.out.println((int)num);
        }
    }
}
