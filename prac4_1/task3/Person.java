package prac4_1.task3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        fullName = "Кто-то";
    }

    public void move(){
        System.out.println(fullName+" идёт");
    }

    public void talk(){
        System.out.println(fullName+" говорит");
    }


}
