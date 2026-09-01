package Lesson1;

public class DataCasting {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        long d = c; //묵시적 형변환(=업 캐스팅)
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int e = (int)d; //명시적 형변환(=다운 캐스팅)
        System.out.println("e = " + e);

        float f = 1.1f;
        double d2 = f; //묵시적 형변환(=업 캐스팅)
        System.out.println("d2 =" + d2);

        float f2 = (float)d2;
        System.out.println("f2 = " + f2);
    }
}
