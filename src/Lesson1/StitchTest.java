package Lesson1;

public class StitchTest {

    public enum Day{
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    public static void main(String[] args) {
        Day day = Day.TUE;

        System.out.println(
            switch(day){
                case MON -> "원래 마시는 날";
                case SUN -> "원래 마시는 날";
                default -> "마시는 날";
            }
        );

    }
}
