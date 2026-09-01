package Lesson2;

public sealed class Person permits Student {

    public Person(){  //생성자1
        System.out.println("Person 생성자 호출..");
    }

    public Person(String name, int age){ //생성자2
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age; //private은 외부에서 접근불가하다.

    public int getAge() {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    public void sleep(){
//        System.out.println("사람이 잔다.");
//    }

}
