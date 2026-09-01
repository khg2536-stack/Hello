package Lesson3;

import java.util.*;

public class MapTest {
    static void main(String[] args) {
        //매핑 테스트
        //트리맵 구조로 객체생성
        Map<String, Integer> map = new TreeMap<>();

        //만들어진 map객체에 데이터 삽입
        map.put("s26", 100);
        map.put("s26+", 200);
        map.put("s26u", 300);
        map.put("fold7", 250);

        //System.out.println(map.get("s26"));
        //System.out.println(map.size());
        //System.out.println(map.containsKey("s26"));

        //phoneSet에 keySet의 키들을 집어 넣는다.
        Collection<Integer> phoneSet = map.values();
        System.out.println("---------------------------------------------");
        System.out.println(phoneSet);

        //phone이라는 문자열 객체에 phoneSet의 데이터를 집어넣는다.
        for (Integer phone : phoneSet){
            System.out.println(phone);
        }
    }
}
