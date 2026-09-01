package Lesson2.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    static void main(String[] args) {
        //영화목록
        ArrayList<String> movies = new ArrayList<>();
        movies.add("플래시");
        movies.add("비긴어게인");
        movies.add("원스");

        // Contains, IndexOf
        System.out.println(movies.contains("비긴어게인"));
        System.out.println(movies.indexOf("비긴어게인"));
        System.out.println(movies);

        Iterator<String> iterator = movies.iterator();
        while (iterator.hasNext()){
            String m = iterator.next();
            System.out.println(m);
        }
    }
}
