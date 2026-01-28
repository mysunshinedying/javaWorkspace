package ch03.sec02;

public class ConditionOp {
    public static void main(String[] args) {
        // 삼항 : ?: (조건 연산자)
        int score = 85;
        char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
        //괄호 없어도 됨

        System.out.println(score + "점은 " + grade + "등급 입니다");
    }
}
