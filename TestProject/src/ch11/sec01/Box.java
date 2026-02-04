package ch11.sec01;

public class Box {
    //모든 타입을 표현하는 타입(객체) : java object 클래스를 상속받아 구성되어 있다. 기본 데이터 타입도 object가 포함
    private Object object;
    public void set(Object object){
        this.object = object;
    }

    public Object get(){
        return object;
    }
}
