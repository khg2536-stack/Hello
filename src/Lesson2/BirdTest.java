package Lesson2;

public class BirdTest {

    static void main(String[] args) {

        Bird bird = new Sparrow();

        if (bird instanceof Sparrow bird2){
            bird2.fly();
        } else if (bird instanceof Stork bird3) {
            bird3.fly();
        }

//        bird.fly();
//        bird.cry();

//        Bird bird1 = new Stork();
//        bird1.fly();
//        bird1.cry();
//        System.out.println(Bird.introduce());

//        Sparrow bird2 = (Sparrow)bird;

    }

}
