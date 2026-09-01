package Lesson2;

public interface Bird {

    void fly();
    default void cry(){
        System.out.println("새가 울다");
    }

    static String introduce(){
        return "새입니다.";
    }

}