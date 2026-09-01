package Lesson2;

public class SportsTest2 {
    static void main(String[] args) {
        class HanwhaPlayer implements Sport<Hanhwa>{
            public void introduce(Hanhwa player){
                System.out.println("한화이글스 선수소개");
                introduce(new Hanhwa());
            }
        }
        HanwhaPlayer sport = new HanwhaPlayer();
        //sport.introduce();
    }
}
