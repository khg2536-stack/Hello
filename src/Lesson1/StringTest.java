package Lesson1;

public class StringTest {

    public static void main(String[] args) {
        String name = "권현규";
        String name2 = "권현규";
        System.out.println("이름 : " + name);
        System.out.println("이름 : " + name2);
        System.out.println("name 문자열의 길이 : " + name.length());

        System.out.println("-------------------------------");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        System.out.println("-------------------------------");
        System.out.println(name.equalsIgnoreCase(name2));

        //문자열 탐색
        System.out.println("-------------------------------");
        System.out.println(name.indexOf("현"));
        System.out.println(name.startsWith("권"));
        System.out.println(name.endsWith("규"));


        System.out.println("-------------------------------");
        String poem = "하늘을 우러러\n" +
                "한점 부끄럼 없기를\n";

        String poem2 = """
                하늘을 우러러
                한점 부끄럼 없기를
                """;

        System.out.println(poem);
        System.out.println(poem2);
        System.out.println("-------------------------------");

        String json = """
                {
                "name":"강호동",
                "age":"56",
                }
                """;
        System.out.println("-------------------------------");
        System.out.println(json);
    }
}
