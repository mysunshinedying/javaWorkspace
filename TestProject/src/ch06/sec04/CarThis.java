package ch06.sec04;

public class CarThis {
    String model;
    int speed;
    //this는 클래스 CarThis를 참조함

    CarThis(String model) {
        this.model = model;
    }

    //메서드
    void setSpeed(int speed) {
        this.speed = speed;
    }
    
    void run() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(this.model +
                    "가 달립니다.(시속 : " + this.speed + "km/h)");
        }
    }

    //this 사용 없는 메서드
    //this 참조 없이는 구별 어려울 때 this를 사용
    void run1() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(model +
                    "가 달립니다.(시속 : " + speed + "km/h)");
        }
    }
}
