package ch05.sec01;

public class StringEx {
    public static void main(String[] args) {
        //일반적으로 =로 만들 경우 참조하는 객체는 동일하다.(내용이 동일할 경우)
        String name1 = "홍길동";
        String name2 = "홍길동";

        //name 1, name2는 서로 동등객체인지 독립적인 것인지 확인, 참조변수인 경우 == 같은 객체를 참조하는지 여부 반환
        System.out.println("name1과 name2 참조변수는 동일 객체를 참조하는지의 여부?" + (name1 == name2) );
        System.out.println("name1과 name2 참조변수는 동일값을 갖는지 여부?" + (name1.equals(name2)) );

        String name3 = new String("홍길동");
        String name4 = new String("홍길동");

        //name 3과 4의 경우(new String)
        //독립적인 객체가 생성
        System.out.println("name3과 name4 참조변수는 동일 객체를 참조하는지의 여부?" + (name3 == name4) );
        System.out.println("name3과 name4 참조변수는 동일값을 갖는지 여부?" + (name3.equals(name4)) );

        //name 1과 4의 경우
        System.out.println("name1과 name4 참조변수는 동일 객체를 참조하는지의 여부?" + (name1 == name4) );
        System.out.println("name1과 name4 참조변수는 동일값을 갖는지 여부?" + (name1.equals(name4)) );
    }
}
