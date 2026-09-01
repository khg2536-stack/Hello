package Lesson2;

public class PersonMain {

    static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("권현규", 10);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }
}
