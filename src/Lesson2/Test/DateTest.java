package Lesson2.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateTest {
    static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat format =
                new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
        System.out.println(format.format(date));

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getClass().getName());
        System.out.println(now.getClass().getSimpleName());

        System.out.println(Math.random());
    }
}
