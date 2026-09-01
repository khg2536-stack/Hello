package Lesson1;

import java.util.Scanner;

public class MethodTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 넣으세요");
        int money = sc.nextInt();
        System.out.println("입력금액 : " + money + "원");

        int cup = getCoffee(money);
        int change = ChangeMoney(money);

        System.out.println("총 " + cup + "잔");
        System.out.println("거스름돈 : " + change + "원");
    }

    public static int getCoffee(int money){
        //커피 금액 2000
        return money / 2000;
    }
    public static int ChangeMoney(int money){
        //거스름돈
        return money % 2000;
    }
}
