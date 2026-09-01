package Lesson1;

import java.util.Scanner;

public class BMI_test {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요 : ");
        int height = sc.nextInt();
        System.out.println(height);

        double meter = (double)height / 100;
        System.out.println(meter);

        System.out.print("체중을 입력하세요 : ");
        int weight = sc.nextInt();

        if(meter == 0){
            System.out.println("0으로 나누기는 불가");
            return;
        }

        double bmi = weight / (meter * meter);

        System.out.println("bmi는 " + bmi + "입니다");

    }
}
