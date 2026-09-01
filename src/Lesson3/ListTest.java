package Lesson3;

import java.util.*;

public class ListTest {
    static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
        List<Integer> list = Arrays.asList(1, -15, -5, 1, -15, -5);
        List<String> movies = new ArrayList<> (Arrays.asList("비긴어게인", "원스", "위플래시"));

        movies.add(2, "스타워즈");

        //System.out.println(list);
        System.out.println(movies);
        movies.add(0, "쥬라기공원");
        System.out.println(movies);

        //sort는 오름차순
        //comporater 비교자
        //terminater 종결자
        Comparator<Integer> c = (num1, num2) -> num2.compareTo(num1);
        Collections.sort(list, c);
        System.out.println(list);

        Comparator<String> c2 = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                {
                    return o1.compareTo(o2);
                }
            }
        };
        Collections.sort(list);
        Collections.sort(movies, c2);
        System.out.println(movies);
    }
}
