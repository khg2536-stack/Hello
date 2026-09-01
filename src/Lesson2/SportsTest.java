package Lesson2;

public class SportsTest implements Sport<Hanhwa>{

    static void main(String[] args) {
        Sport<Hanhwa> sport = new SportsTest();
        sport.introduce(new Hanhwa());

        //Sport<Integer> sport2 = new SportsTest();
    }
}
