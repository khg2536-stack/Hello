package Lesson2;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("참새 날다");
    }

    @Override
    public void cry() {
        Bird.super.cry();
    }
}
