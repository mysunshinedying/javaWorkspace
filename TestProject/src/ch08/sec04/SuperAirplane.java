package ch08.sec04;

public class SuperAirplane extends Airplane {
    static final int NORMAL = 1;
    static final int SUPERSONIC = 2;

    int flyMode = NORMAL;

    @Override
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다");
        } else {
            super.fly();
            //재정의 하여도 부모의 메서드는 호출 가능.
        }
    }
}
