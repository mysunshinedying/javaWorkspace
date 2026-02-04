package ch12_collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servelet/JSP");
        list.add(2,"DataBase");
        list.add("MyBATIS");
        //list.add(30); generic 타입 사용하였으므로 String을 받는다

        //항목 수 반환
        int size = list.size();

        System.out.println("총 항목 수 : " + size);
        System.out.println();

        for (int i = 0; i <list.size() ; i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str); //String 타입 진행
        }

        System.out.println();
        String skill = list.get(2);
        System.out.println(2 + " : " + skill);


        list.remove(2); //특정 인덱스 값을 삭제할 경우 비워진 곳은 채워짐 → 이동 발생
        list.remove(2);
        list.remove("MyBATIS");

        System.out.println();
        for (int i = 0; i <list.size() ; i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str); //String 타입 진행
        }

        System.out.println();

        for (String value : list) {
            System.out.println(value);
        }

        //문자열 : 문자열 개수를 반환하는 length() 메서드
        System.out.println();
        System.out.println("각 항목의 문자 수");
        for (String value : list) {
            System.out.println(value + ":" + value.length());
        }
    }
}
