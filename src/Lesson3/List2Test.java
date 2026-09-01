package Lesson3;

import java.util.*;

public class List2Test {
    static void main(String[] args) {
        //리스트의 반복
        List<String> list = new ArrayList<>();
        list.add("서울의 봄");
        list.add("JSA");
        list.add("서편제");
        System.out.println(list);
        System.out.println("---------------------------------------");

        for(String movie : list){
            if (movie.length() <= 3 ){
                list.remove(movie);
            }
        }

        System.out.println("---------------------------------------");
        for (Iterator<String> iterator = list.iterator();
            iterator.hasNext();){
            String movie = iterator.next();
            if (movie.length() <= 3){
                System.out.println(movie);
            }
        }
    }
}
