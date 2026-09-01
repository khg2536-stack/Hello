package Lesson2;

public class Hanhwa {

    public void desc(){
        System.out.println("한화 이글스 선수 소개니다.");
        System.out.println("1");
        System.out.println("2");
    }

    @Override
    public String toString() {
        desc();
        return super.toString();
    }
}
