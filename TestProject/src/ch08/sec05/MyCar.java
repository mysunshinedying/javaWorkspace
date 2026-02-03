package ch08.sec05;

public class MyCar {
    public int speed;

    public void speedUp(){
        speed += 1;
    }

    //final 메서드로 만듦 - 상속은 가능하지만 override를 포함한 수정 불가
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
