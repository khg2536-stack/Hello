package Lesson1_Practice;

public class PersonTest_Practice {

    public static void main(String[] args) {

        Person_Practice p1 = new Person_Practice();
        Person_Practice p2 = new Person_Practice();

        p1.name = "김철수";
        p1.age = 20;

        p2.name = "이영희";
        p2.age = 25;

        p1.introduce();
        p2.introduce();

    }

}
