package ch11.sec02;


public class GenMain {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("홍길동");
        String name = box.get();
        System.out.println(name);

        //Integer를 사용하는 객체 인스턴스
        Box<Integer> box2 = new Box<Integer>();
        box2.set(7);
        int num = box2.get();
        System.out.println(num);

    }
}
