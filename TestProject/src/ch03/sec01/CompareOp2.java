package ch03.sec01;
import java.util.Scanner;


public class CompareOp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "1234";
        String userPass;

        System.out.print("비밀번호 입력 : ");
        userPass = sc.next();

        if(pass == userPass)
            System.out.println("PASS");
        else
            System.out.println("NO PASS");

        if(pass.equals(userPass))
            System.out.println("PASS");
        else
            System.out.println("NO PASS");

        sc.close();
    }
}
