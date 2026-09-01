package Lesson1;

import java.util.Scanner;

public class HelloWorld {
    static void main(String[] args) {
        //System.out.println("Hello");

        Scanner scan = new Scanner(System.in);

        System.out.print("입력숫자 : ");
        int input_number = scan.nextInt();
        System.out.print("입력숫자는 : " + input_number + "입니다.");

    }
}
