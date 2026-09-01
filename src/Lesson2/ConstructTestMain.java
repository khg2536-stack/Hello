package Lesson2;

public class ConstructTestMain {

    public static void main(String[] args) {

        ConstructTest ct = new ConstructTest("LMS", "PT");

        System.out.println(ct.getAddr());
        System.out.println(ct.getName());
    }

}
