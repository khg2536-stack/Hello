package Lesson1_Practice;

public class String_Practice {
    static void main(String[] args) {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = new String("홍길동");

        // true
        System.out.println(name1 == name2);
        // false
        System.out.println(name1 == name3);
        // true, (==) → 참조값 비교, equals()함수 → 문자열 내용 비교
        System.out.println(name1.equals(name3));
    }
}
