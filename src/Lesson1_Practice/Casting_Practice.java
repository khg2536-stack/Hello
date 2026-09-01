package Lesson1_Practice;

public class Casting_Practice {
    static void main(String[] args) {
        int height = 175;

        // int / int이므로 정수 나눗셈이 적용되어 175 / 100의 결과는 1입니다. 이후 double 변수에 들어가면서 1.0이 됩니다
        double meter1 = height / 100;

        // 100.0이 double이므로 height도 자동 형변환되어 175.0 / 100.0, 즉 1.75가 됩니다.
        double meter2 = height / 100.0;

        System.out.println(meter1);
        System.out.println(meter2);
    }
}
