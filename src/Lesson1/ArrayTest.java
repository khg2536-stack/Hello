package Lesson1;

public class ArrayTest {
    public static void main(String[] args) {
        int[] myArray = {1,2,3};

//          myArray[0] = 10;
//          myArray[1] = 20;

//        System.out.println(myArray[0]);
//        System.out.println("0인덱스만 출력");

//      for(int i = 0; i < myArray.length; i++){
//          System.out.println(myArray[i]);
//      }
//        for (int num : myArray){
//            System.out.println(num);
//        }

        //2차원 배열
        int[][] myArray2 = {
            {1,3}, {2,4}, {3,7}
        };

        for(int i = 0; i < myArray2.length; i++){
            for(int j = 0; j < myArray2[i].length; j++){
                System.out.print(myArray2[i][j] + ",");
            }
            System.out.println();
        }
    }
}
