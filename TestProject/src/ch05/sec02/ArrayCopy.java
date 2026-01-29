package ch05.sec02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = a;

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }//for문 종료
        System.out.println();

        a[0] = 100;

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        } //for문 종료
        System.out.println();

        for(int i = 0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }//for문 종료

        System.out.println("\ndeepCopy : 변경 전 출력");


        //깊은 복사 예제

        int[] deepCopy = new int[4];

        for (int i = 0; i < a.length; i++) { //순회복사, JS의 경우도 깊은 복사로 적용이 된다.
            deepCopy[i] = a[i];
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        } //for문 종료
        System.out.println();

        for(int i = 0; i< deepCopy.length; i++){
            System.out.print(deepCopy[i] + " ");
        }//for문 종료

        System.out.println("\ndeepCopy : 변경 후 출력");

        a[3] = 1000;

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        } //for문 종료
        System.out.println();

        for(int i = 0; i< deepCopy.length; i++){
            System.out.print(deepCopy[i] + " ");
        }//for문 종료

        //메서드 활용한 deepCopy(clone)
        int deepCopy2[] = a.clone();

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        } //for문 종료
        System.out.println();

        for(int i = 0; i< deepCopy2.length; i++){
            System.out.print(deepCopy2[i] + " ");
        }//for문 종료

        System.out.println("\ndeepCopy : 변경 후 출력");

        a[1] = 50;

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        } //for문 종료
        System.out.println();

        for(int i = 0; i< deepCopy2.length; i++){
            System.out.print(deepCopy2[i] + " ");
        }//for문 종료

        System.out.println();

        //Arrays.copyOf(원본, 복사할 요소의 개수) : 복사할 요소의 개수가 원본 길이보다 크면 초기값으로 이용
        int copyDeep[] = Arrays.copyOf(a, a.length);
        int copyDeep1[] = Arrays.copyOf(a, a.length + 3); //복사하며 요소수 확장
        int copyDeep2[] = Arrays.copyOf(a, a.length - 1); // 일부 복사 제외

        for(int i = 0; i< copyDeep.length; i++){
            System.out.print(copyDeep[i] + " ");
        }//for문 종료

        System.out.println();

        for(int i = 0; i< copyDeep1.length; i++){
            System.out.print(copyDeep1[i] + " ");
        }//for문 종료

        System.out.println();

        for(int i = 0; i< copyDeep2.length; i++){
            System.out.print(copyDeep2[i] + " ");
        }//for문 종료

        System.out.println();

        //Arrays.CopyOfRange(원본 배열, 시작 인덱스, 끝 인덱스 +1): 복사 범위(시작~끝 인덱스까지 복사)
        int test[]= Arrays.copyOfRange(a,1,3);

        System.out.println();

        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println();

        int test2[] = new int[10];

        //System.arrayCopy(원본, 원본의 시작 인덱스, 대상배열객체참조, 대상의 시작 인덱스, 복사할 개수)
        System.arraycopy(a,1,test2,0,2);

        for (int i = 0; i < test2.length; i++) {
            System.out.print(test2[i] + " ");
            
        }
        System.out.println();

        // 배열 크기 변경
        // 생성 후에는 크기 변경 불가. 깊은 복사로 크기를 수정해야함. Arrays.copyOf()를 주로 사용.

        //a.length = 10;

        int[] newA = Arrays.copyOf(a, 10);
        //기존 배열은 삭제
        a = null; //할 경우 배열은 전부 삭제, 참조하는 객체는 사용 불가능.
        // 객체 주소를 a만 알고 있을 경우, a의 참조 링크를 삭제하면 참조 방법이 사라짐
        //이런 경우 해당 메모리는 가비지 콜렉터에 의해 자동 정리

        //int test4 = a[0];
        //a가 null이라면 java.lang.NullPointer.Exception 오류가 발생함


    }
}
