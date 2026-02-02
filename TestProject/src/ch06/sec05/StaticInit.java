package ch06.sec05;

public class StaticInit {
    //인스턴스 필드와 메서드
    int a;
    void method(){ //...

    }
    //static 필드와 메서드
    static int staticA;
    static void staticMethod(){
        //static 메서드 내 this 사용 불가
        //this.a = 10;
    };

    //static 블록(초기화)
    static {
        //a = 1; 인스턴스 변수는 사용 불가
        //method(); 인스턴스 메서드 사용 불가
        staticA = 10;
        staticMethod();

        //객체 인스턴스 생성 후 사용은 가능
        StaticInit st = new StaticInit();
        st.a = 10;

    }

}
