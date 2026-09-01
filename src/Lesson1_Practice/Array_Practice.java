package Lesson1_Practice;

public class Array_Practice {

    static void main(String[] args) {
        //정수형 배열3개의 공간을 만든다.
        int[] nums = new int[3];
        //실수형타입의 배열3개를 만든다.
        Double[] scores = new Double[3];

        //정수형 빈배열은 출력시 0이 나온다.
        System.out.println(nums[1]);

        //실수형이지만 Double과 double은 다르다. double은 값이지만 Double은 참조형태이다. 그래서 null값이 나온다.
        System.out.println(scores[1]);
    }
}
