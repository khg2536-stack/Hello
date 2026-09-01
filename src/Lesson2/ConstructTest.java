package Lesson2;

public class ConstructTest {

    private final String name;
    private final String addr;

//    public ConstructTest() {
//        name = "KHG";
//        addr = "PT";
//    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;

    }
    public ConstructTest(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

}