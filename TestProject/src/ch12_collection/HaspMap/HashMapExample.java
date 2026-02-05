package ch12_collection.HaspMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
//@260205 PM 3:08 exit를 입력하라는 안내문구 print문을 추가했습니다.

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String eng;
        String kor;
        String word;
        String result = null; //초기화 과정 필요
        Scanner sc = new Scanner(System.in);

        System.out.println("*** 단어장 프로그램 실행. 종료 시 exit를 입력하세요 ***");
        while(true) {
            System.out.print("단어를 등록하세요(영어 한글) : ");
            eng = sc.next();
            if (eng.equals("exit")) {
                break; //exit을 입력하면 탈출한다
            }
            kor = sc.next();
            //현재로서는 띄어쓰기를 통한 나누기(sc.next()) 말고는 입력법을 못찾았습니다.
            map.put(eng,kor);
        }

        System.out.println("입력을 종료합니다.");

        while(true) {
            System.out.print("찾고 싶은 단어는?(영어) : ");
            word = sc.next();
            if (word.equals("exit")) {
                break; //exit을 입력하면 탈출한다
            }

            Set<Entry<String, String>> entrySet = map.entrySet();

            for(Entry<String, String> entry:entrySet){
                if(entry.getKey().equals(word)){
                    result = entry.getValue(); //result를 처리
                    break; //찾았으므로 break 처리
                }
            }

            if (result == null) { //있거나 없다면 다음처럼 출력한다
                System.out.println(word + "는 없는 단어 입니다.");
            } else {
                System.out.println(result);
            }

        }

        System.out.println("종료합니다...");

        sc.close();


    }
}
