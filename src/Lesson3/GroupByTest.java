package Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByTest {
    static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("스타워즈","어드벤처",2015));
        movieList.add(new Movie("어벤저스","어드벤처",2016));
        movieList.add(new Movie("서울의 봄","어드벤처",2017));
        movieList.add(new Movie("남산의 부장들","어드벤처",2018));
        movieList.add(new Movie("오디세이","코미디",2019));

        Map<String, List<Movie>> genreMap = movieList.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        //코미디 장르
        List<Movie> comedies = genreMap.get("코미디");
        comedies.forEach(System.out::println);

        //영화 제목을 스타로 시작하는 영화를 1만 출력
        //출력
        Optional<Movie> movie = movieList.stream()
                .filter(a->a.getTitle().startsWith("스타"))
                .findFirst();
        if (movie.isPresent()){
            System.out.println("'스타'라는 글자가 들어가 영화 : " + movie.get());
        }else {
            System.out.println("영화를 찾을 수 없음");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        //영화중에서 개봉 년도가 가장 오래된 영화
        Optional<Movie> movie2 = movieList.stream()
                .min((m1, m2) -> m1.getReleaseYear() - m2.getReleaseYear());
        System.out.println(movie2);

        System.out.println("+++++++++++++++++++영화 중 서울로 시작하는 영화의 수 COUNT함수++++++++++++++++++");
        //영화 중 서울로 시작하는 영화의 수 COUNT함수
        long count = movieList.stream()
                .filter(m -> m.getTitle().startsWith("서울"))
                .count();
        System.out.println(count);
    }
}
