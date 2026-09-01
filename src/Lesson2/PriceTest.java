package Lesson2;

import java.util.Scanner;

public class PriceTest {
    static void main(String[] args) {
        //일본(10%)
        PriceCalculator calc = (p1, p2) -> {
            return p1 + (p1 * p2);
        };
        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 입력하세요 : ");
        double price = sc.nextDouble();
        System.out.println("세율울 입력하세요 : " );
        double tax = sc.nextDouble();
        System.out.println("총금액 : " + calc.calculate(price, tax));
    }
}
