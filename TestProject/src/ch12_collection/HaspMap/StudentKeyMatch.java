package ch12_collection.HaspMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentKeyMatch {
    public static void main(String[] args) {
        Student key = new Student("3", "성춘향");
        //key를 참조 타입으로 사용
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student("1","홍길동"),90);
        map.put(new Student("2","이몽룡"),80);
        map.put(new Student("3", "성춘향"),100); // key : 독립적인 student 인스턴스
        map.put(new Student("3", "성춘향"),99);
        // 새 entry 추가 : Student 클래스의 equals/hashcode() 재정의하면 동등하게 처리 가능

        Set<Student> key_set = map.keySet();
        for(Student stdKey : key_set){
            System.out.println(stdKey.getStdNo() + " " + stdKey.getStdName() + " " + map.get(stdKey));
        }

        System.out.println("총 Entry 수 : " + map.size());
        //사용자 정의 클래스에서 객체를 HashMap의 키로 사용하려면
        //hashCode()와 equals() 메서드를 재정의하여 동등객체가 될 조건을 정해야함


    }
}
