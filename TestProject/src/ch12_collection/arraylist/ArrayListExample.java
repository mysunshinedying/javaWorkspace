package ch12_collection.arraylist;
//나중에 제출
//260204 PM5:41 필드명을 가시적으로 수정

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < 4; i++) { //for문으로 반복문 단순화
            System.out.print("단어를 입력하세요>>");
            wordList.add(sc.next()); //sc.next를 바로 add에 넣기(메모리 효율화)
        }//for문 종료
        System.out.println("------------------------");

        String longestWord = wordList.get(0);

        for (String word:wordList) {
            System.out.print(word+" ");
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        } //for문 종료

        System.out.println("\n가장 긴 단어는 : " + longestWord);
        System.out.println("가장 긴 단어의 길이는 : " + longestWord.length());


    }
}
