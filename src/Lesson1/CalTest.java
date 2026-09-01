package Lesson1;

import java.util.Scanner;

public class CalTest {

    static void main(String[] args) {
        //덧셈만 해보기
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번쨰 숫자 : ");
        int firstNum = scan.nextInt();
        System.out.print("두번쨰 숫자 : ");
        int secondNum = scan.nextInt();

        if(secondNum == 0){
            System.out.println("0으로 나누기는 불가");
            return;
        }

        int sum = firstNum + secondNum;
        int min = firstNum - secondNum;
        int com = firstNum * secondNum;
        int div = firstNum / secondNum;
        double div2 = (double)firstNum / secondNum;
        int mod = firstNum % secondNum;

        System.out.println("가 : " + sum);
        System.out.println("감 : " + min);
        System.out.println("승 : " + com);
        System.out.println("제 : " + div2);
        System.out.println("나머지 : " + mod);
    }
}
