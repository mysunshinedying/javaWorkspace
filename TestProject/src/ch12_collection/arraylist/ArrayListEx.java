package ch12_collection.arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList listAr = new ArrayList();
        List list = new ArrayList();

        list.add(100);
        list.add("홍길동");
        list.add(5.77);
        list.add('a');

        //컬렉션 내 객체의 개수
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //Object 타입으로 진행(비권장)
        }

        System.out.println();
        //특정 index에 추가
        list.add(0,"변경");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
        //특정 index의 요소를 삭제
        list.remove(1); //삭제 이후 index들이 앞으로 이동
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        //특정 요소가 리스트 내 항목 포함 여부
        System.out.println(list.contains("홍길동"));
        
        //해당 항목이 없을 경우 순서 마지막에 추가함
        if(!(list.contains("홍길동"))) {
            list.add("홍길동");
        }

    }
}
