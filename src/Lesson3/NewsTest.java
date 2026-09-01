package Lesson3;

import java.io.*;

public class NewsTest {
    static void main(String[] args) {
        //BufferedReader reader = null;

//        File file = new File("C:/work/news.txt");
//
//        try {
//            reader = new BufferedReader(new InputStreamReader(
//                    new FileInputStream(file),"UTF-8")
//            );
//        };
//
//        for (String line; (line = reader.readLine()) != )
        File file = new File("C:/work/news.txt");

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), "UTF-8"))){
            for(String line; (line = reader.readLine()) != null;){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
