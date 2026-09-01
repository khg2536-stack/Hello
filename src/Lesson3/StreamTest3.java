package Lesson3;

import java.util.stream.IntStream;

public class StreamTest3 {
    static void main(String[] args) {
        //range(n, m) n부터 m-1까지의 숫자 출력
        //m까지 표현하고 싶다면 rangeClosed(n, m) 메소드 사용
        IntStream myStream = IntStream.rangeClosed(1, 5);
        myStream.forEach(System.out::println);

        IntStream.range(0, 6).forEach(i -> {
            System.out.println("어벤저스" + ( i+1));
        });
    }
}
