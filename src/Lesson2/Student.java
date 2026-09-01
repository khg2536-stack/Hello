package Lesson2;

public non-sealed class Student extends Person {

    public Student(){
        super("학생", 20);
        System.out.println("학생 생성자 호출.");
    }

    public void study(){
        System.out.println("공부중");
    }

    public void sleep(){ //파라미터가 완전히 동일해서 오버라이딩이 된다.
        System.out.println("학생이 잔다.");
    }

    static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.getName());
        System.out.println(student.getAge());

        student.study();
        student.sleep(); //상속받은 sleep은 내부에 sleep메소드가 있을 경우 부모의 것이 자식의 메소드가 실행된다.
    }

}
