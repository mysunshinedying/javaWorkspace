package ch11.sec01;

public class NonGenMain {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box();

        box.set("홍길동");
        box2.set(7);
        box.set(10.0);
        box.set('a');

        box.set("김길동"); //문자열 data 생성
        //타입 불일치 에러가 발생
        String name = (String)box.get(); //object 타입의 data가 반환
        System.out.println(name);

        box2.set(100);
        int num = (int)box.get();
        System.out.println(num);
    }
}
