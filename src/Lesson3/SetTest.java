package Lesson3;

import java.util.*;

public class SetTest {
    static void main(String[] args) {
        //set은 인덱스, 순서도 없으며 중복 불가.
        Set<String> A = new HashSet<>();
        Set<String> B = new LinkedHashSet<>();
        Set<String> C = new TreeSet<>();
        A.add("터미네이터");
        A.add("비긴어게인");
        A.add("트랜스포머");
        A.add("아이언맨");
        System.out.println(A.size());

        //movies.remove("터미네이터");
        //System.out.println(movies.size());

        List<String> movieList = Arrays.asList("영화A", "영화B", "영화C");
        Set<String> movieSet = new HashSet<>(movieList);
        System.out.println(movieList);
        System.out.println(movieSet);
    }
}
