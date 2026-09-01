package Lesson1_Practice;

class Person {
    String name;
    int age;
}
public class ReferenceTest_Practice {

    static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;

        //이 코드는 p1 객체를 복사해서 새 객체를 만드는 것이 아닙니다. p1이 가진 참조값을 p2에 복사합니다.
        //따라서 p1과 p2는 같은 객체를 가리킵니다.
        Person p2 = p1;

        //p2가 가리키는 객체의 age를 30으로 바꾸면, p1로 확인해도 같은 객체이므로 30이 나옵니다.
        p2.age = 30;

        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p1 == p2);
    }
}
