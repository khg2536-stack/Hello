package Lesson3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class NewsTest2 {
    static void main(String[] args) {

        File file = new File("C:/work/news.txt");

        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(file), StandardCharsets.UTF_8)
        )) {
            writer.append("이재명");
            writer.newLine();
            writer.append("이재명2");
            PrintWriter pw = new PrintWriter(writer);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
