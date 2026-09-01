package Lesson1;

public class PersonTest {

    public static void main(String[] args) {

        Person kang = new Person();
        kang.name = "강호동";
        kang.hobby = "씨름";
        kang.age = 56;

        System.out.println(kang.name);
        System.out.println(kang.age);
        System.out.println(kang.hobby);

        System.out.println("-----------------------------");

        Person babo = null;

        babo = kang;
        System.out.println(babo.name);
        System.out.println(babo.age);
        System.out.println(babo.hobby);

        System.out.println("-----------------------------");

        babo.name = "바보";
        System.out.println(kang.name);

    }
}
