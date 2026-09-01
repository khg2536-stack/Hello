package Lesson2;

public interface Sport <T>{
    public default void introduce(T player){
        System.out.println(player + "소개");
    }
}
