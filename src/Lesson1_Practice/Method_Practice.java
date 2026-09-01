package Lesson1_Practice;

public class Method_Practice {

    public static void main(String[] args) {
        int result = max(10, 25);
        System.out.println(result);
    }

    public static int max(int x, int y){
        if(x > y){
            return x;
        }else
            return y;

    }
    //삼항연산자 사용시
    //public static int max(int x, int y) {
    //    return x > y ? x : y;
    //}
}
