package ch04.sec03;

public class Break2 {
    public static void main(String[] args) {
        //이름 명명: 바깥 for문을 지칭하는 label
        Outter:for (char upper = 'A'; upper <= 'Z'; upper++){
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower == 'g') {
                    break Outter;
                }
                /*if(upper = 'K'){
                    break;
                }*/
            } //a for 종료
        }// A for 종료
    }
}
