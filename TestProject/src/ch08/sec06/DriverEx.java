package ch08.sec06;

public class DriverEx {
    public static void main(String[] args) {
        //매개변수 다형성 예시
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //인수 전달 시 서브 클래스 타입의 인수를 전달
        //한 개의 매개변수에 두 개 타입을 인수로 전달
        driver.drive(taxi);
        driver.drive(bus);
    }
}
