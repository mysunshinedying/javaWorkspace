//한 개 소스에 여러 클래스가 있을 때는 public은 하나만이 가능

class A {

}

class B {

}

public class Test {
    public static void main(String[] args) {
        String A = "hello, World";
        int B = 99;
        System.out.println("test" + "ya");
        //문장 블럭엔 마지막엔 반드시 세미콜론
        System.out.println(A + B);
        //한줄 주석
        /*
        * 오 주석
        */
    }
}
