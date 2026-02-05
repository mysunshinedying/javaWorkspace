package ch10;

public class Throws {
    public static void main(String[] args) {
        // throws 문 포함된 메서드 호출
        try {
            findClass();
            findClass2();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } catch (Exception e){
            System.out.println("예외가 발생했습니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException { //메서드 호출한 쪽에 예외발생 신호 보냄
         Class clazz = Class.forName("java.lang.String2"); //메서드 내 코드에서 예외 발생
    }

    public static void findClass2() throws Exception { //메서드 호출한 쪽에 예외발생 신호 보냄
        Class clazz = Class.forName("java.lang.String2"); //메서드 내 코드에서 예외 발생
    }

}
