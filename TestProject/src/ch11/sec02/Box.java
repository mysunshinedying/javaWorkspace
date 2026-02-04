package ch11.sec02;

public class Box<T> {
    //모든 타입을 표현하는 타입(객체) : java object 클래스를 상속받아 구성되어 있다. 기본 데이터 타입도 object가 포함
    private T object;
    public void set(T object){
        this.object = object;
    }

    public T get(){
        return object;
    }
}
