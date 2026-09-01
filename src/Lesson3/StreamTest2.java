package Lesson3;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    static void main(String[] args) {
        List<String> list =
                Arrays.asList("영화1", "영화2", "영화3", "영화4");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        Map<String, Integer> apple = new HashMap<>();
        apple.put("아이폰", 100);
        apple.put("맥북", 150);
        apple.put("에어팟", 30);

        Set<Map.Entry<String, Integer>> set = apple.entrySet();
        for(Map.Entry<String, Integer> item : set){
            System.out.println(item.getKey() + " : " + item.getValue());
        }

        Stream<Map.Entry<String, Integer>> stream = apple.entrySet().stream();
        stream.forEach(a -> System.out.println(a.getKey() + " : " + a.getValue()));
    }
}
