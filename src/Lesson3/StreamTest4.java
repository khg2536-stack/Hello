package Lesson3;

import java.util.*;
import java.util.stream.*;


public class StreamTest4 {
    static void main(String[] args) {
        //collect
        List<String> list = Arrays.asList("영화1", "영화22", "영화333", "영화4444", "영화55555");
        //영화 제목의 길이가 5이상의 이름을 추출
        List<String> newList = list.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(newList);

        String joined = list.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.joining(","));
        System.out.println(joined);

    }
}
