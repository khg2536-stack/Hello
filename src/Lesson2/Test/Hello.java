package Lesson2.Test;

public class Hello {
    static void main(String[] args) {
        //래퍼클래스 테스트
        //Integer
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer num1 = Integer.valueOf(10); //박싱
        Integer num2 = 10; //오토 박싱

        //STring -> Int
        Integer num3 = Integer.valueOf(10); //참조타입이라 속도가 느림
        int num4 = Integer.parseInt("10");  //일반형이라 속도가 빠름

        //int -> String
        String num5 = Integer.toString(10);
        String num6 = num3.toString();
        //System.out.println(num6);
        String num7 = "" + 10;

        Integer score = null;

        Integer in1 = 100;
        Integer in2 = 100;
        System.out.println(in1.equals(in2));

        System.out.println(in1 + in2);
    }
}
