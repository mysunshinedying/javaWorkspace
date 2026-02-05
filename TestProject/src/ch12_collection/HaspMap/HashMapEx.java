package ch12_collection.HaspMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        // Map<Key,Value>
        Map<String, Integer> map = new HashMap<>();

        //Map의 key는 중복될 수 없음 : entry 구별하는 용도 key
        //Map Collection에 객체 저장 : put(key,value)
        //key 값이 중복될 경우 => key값이 컬렉션에 존재하는지 확인 후 있으면 value만 수정

        map.put("김길동",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95); //key가 중복되므로 앞에서 put한 key(홍길동:90)의 entry value가 변경(덮어써짐)
        //String 클래스는 ""구성한 문자열 값이 같을 경우 동등 객체가 될 수 있도록
        //hashCode()와 equals() 메서드가 재정의 되어있음


        //전체 entry 수 : size()
        System.out.println("총 entry 수 : " + map.size());

        //Map.get(key) : 특정 key에 대한 value 추출
        System.out.println("key 홍길동에 대한 value : " + map.get("홍길동"));
        System.out.println();

        //Map.keySet() : 모든 entry의 key 객체를 반환(Set타입으로 반환)
        //Set : 순서가 없고 중복값이 없는 컬렉션
        Set<String> keySet = map.keySet();

        //모든 collection 객체는 Iterator 인터페이스를 구현한다 Iterator()
        //콜렉션 순회를 가능하게 해주는 객체 Iterator 객체를 반환 함
        //stream보다는 iterator가 더 범용적으로 사용
        Iterator<String> keyIterator = keySet.iterator();
        //map의 전체 entry를 출력
        //Iterator.hasNext() : 참조할 항목이 있는지 여부를 반환(true/false)
        while(keyIterator.hasNext()){
            String key = keyIterator.next(); //참조한 항목의 값을 반환하고 다음 참조쪽으로 이동
            Integer value = map.get(key); //int 처리도 괜찮음
            System.out.println("\t" + key + " : " + value);
        }

        System.out.println();

        for(String k: keySet){
            Integer value = map.get(k);
            System.out.println("\t" + k + " : " + value);
        }

        //map.entrySet() : 모든 entry 반환(Set 타입으로 반환- Map은 entry의 중복은 없음)
        System.out.println();

        Set<Entry<String,Integer>> entrySet = map.entrySet();
        for(Entry<String,Integer> entry: entrySet){
            //특정 entry의 key 추출 : Entry.getKey()
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }

        System.out.println();
        //모든 entry를 삭제 : Map.clear();
        map.clear();
        System.out.println("총 entry 수 : " + map.size());


    }
}
