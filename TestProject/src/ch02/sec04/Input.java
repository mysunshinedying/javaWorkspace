package ch02.sec04;
import java.util.Scanner; //외부 클래스 - 인스턴스

public class Input {
    public static void main(String[] args) {
        //참조 변수 sc: 인스턴스 선언시 활용 객체 타입으로 선언
            Scanner sc = new Scanner(System.in); //키보드를 통해 선언된 바이트코드를 메서드에 따라 변환된 값으로 반환
            int num1, num2;
            System.out.println("첫번째 숫자 입력 : ");
            num1 = sc.nextInt(); //사용자가 입력 후 enter 넣을 때까지 대기

            System.out.println("두번째 숫자 입력 : ");
            num2 = sc.nextInt();

            System.out.println("두 수의 합은 : " + (num1 + num2));
            System.out.println("두 수의 곱은 : " + (num1 * num2));

            //문자열 입력: sc.next();

        String grade;
        System.out.println("문자열을 입력하세요");
        grade = sc.next();
        System.out.println(grade);

        char grd;
        System.out.println("문자를 입력하세요");
        //grd = sc.next(); 문자열로 인식하여 불가능
        //문자열로 입력받은 후 한 문자만 추출: String.charAt(0)

        grd = sc.next().charAt(0);
        System.out.println(grd);


        }
}