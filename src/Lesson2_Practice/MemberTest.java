package Lesson2_Practice;

//public class MemberTest {
//
//    public static void main(String[] args) {
//        Member m1 = new Member();
//        Member m2 = new Member("권현규");
//
//        System.out.println(m1.getName());
//        System.out.println(m2.getName());
//    }
//}

public class MemberTest {

    public static void main(String[] args) {
        Member m1 = new Member("김철수");
        Member m2 = m1;

        m2.setName("이영희");

        System.out.println(m1.getName());
        System.out.println(m2.getName());
        System.out.println(m1 == m2);
    }
}