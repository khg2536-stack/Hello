package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class StreamTest1 {
    static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("권현규", 90));
        students.add(new Student("김철수", 50));
        students.add(new Student("이영희", 80));

        //점수가 70점 이상인 학생의 이름을 출력
        students.stream()
                .sorted((s1, s2) -> s2.getScore() - s1.getScore())
//              .filter(s -> s.getScore() >= 70)
//              .forEach(s-> System.out.println(s.getName()));
//                .map(s->s.getScore())
                .forEach(System.out::println);
    }
}
