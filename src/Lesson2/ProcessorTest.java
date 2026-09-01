package Lesson2;

public class ProcessorTest {
    static void main(String[] args) {
        Processor<String> Insa = (String name) -> {
          return name + "님, 안녕하세요.";
        };
        System.out.println(Insa.process("강호동"));
    }
}
