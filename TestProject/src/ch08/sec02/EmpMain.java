package ch08.sec02;

import ch08.sub_p.Manager;

public class EmpMain {
    public static void main(String[] args) {
        Manager mg = new Manager();

        mg.setManager(); //1차 정보 저장
        mg.showManageInfo(); //저장된 정보 확인
        mg.setManager(); //다시 입력
        mg.showManageInfo();
        mg.exitSc();
    }
}
