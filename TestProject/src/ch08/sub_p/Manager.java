package ch08.sub_p;

import ch08.super_p.Employee;

import java.util.Scanner;

public class Manager extends Employee {

    //Employee를 상속 받음, 필드는 모두 private이므로 접근은 불가
    //단, 필드의 저장 공간은 생성된다.
    //Scanner sc = new Scanner(System.in);
    private String position;

    //2번 이상 사용하면 scanner가 close되어 오류
    public void setManager(){
        setEmployee(); //super 클래스 메서드를 호출하여 일반 직원 정보를 저장한다.
        System.out.print("직위 입력 : ");
        position = sc.next();
        //sc.close();
    }

    //Manager 객체 정보 출력
    public void showManageInfo(){
        showEmpInfo();
        System.out.println("직위 : " + position);

    }


}
