package ch06.sec05;

public class StaticMember {
    //static : 클래스에 고정되는 멤버, 전역변수/전역함수 구성 시 사용
    //프로그램 실행 시 생성, 종료 시 삭제
    //객체 멤버와는 다른 컴파일러에 의하여사용

    //static member: 접근 제한자 static 타입 변수명;
    public static int staticVal;
    public int num; //인스턴스 필드

    public void getNum(int x){ //인스턴스 메서드
        num = x;
        staticVal = x;
        staticMethod(x);
    }

    public static void f1  (){
        StaticMember test = new StaticMember(); //직접 개체 생성
        test.getNum(0); //이 상황에서는 인스턴스 사용 가능
    }

    public static void staticMethod(int x){
        //num = x; //static 메서드 안에서 인스턴스 참조 불가
        staticVal = x;
        //getNum(x); //인스턴스 메서드 사용불가
        f1(); //static 메서드 사용은 가능
    }
}
