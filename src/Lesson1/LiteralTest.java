package Lesson1;

public class LiteralTest {

    public final int juso = 605;
    public final static int JOSO = 101;


    public static void main(String[] args) {
        int a = JOSO;  //정수형
        //juso = 606;
        long b = 1000L;
        float f = 54.12f;
        double d = 54.12d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        //System.out.println("juso = " + juso);
        char c = '권';
        System.out.println(c);

        boolean isMan = true; // 참이나 거짓.
        System.out.println(isMan);
    }
}
