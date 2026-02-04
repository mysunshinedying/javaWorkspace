package ch12_collection.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {
    public static void main(String[] args) {
        //고정된 객체로 ArrayList 구성할 경우, 항목이 고정.
        //추가 불가능, 삭제 불가능
        List<String> list1 = Arrays.asList("홍길동", "신길동","김자바");
        for(String name:list1){
            System.out.println(name);
        }
        //list1.add("김길동");
        //list1.remove(0);

        for (String name:list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1,2,3);
        for(int num:list2){
            System.out.println(num);
        }

    }
}
