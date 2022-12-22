package prac2;

public class Kennel {
    private static Dog[] kennel;
    private static int count = 0;

    public static void addDog(String name, int age){
        kennel[count] = new Dog(name,age);
        count++;
    }

    public static void main(String[] args) {
        kennel = new Dog[20];
        addDog("Бобик", 4);
        System.out.println(kennel[count-1].convert());
    }
}
