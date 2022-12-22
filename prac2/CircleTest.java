package prac2;

public class CircleTest {
    public static void main(String[] args) {
        Circle C1 = new Circle(0,0,10);
        Circle C2 = new Circle(0,0,10);
        Circle C3 = new Circle(0,0,5);
        System.out.println(C1.area());
        System.out.println(C3.length());
        C1.compare(C2);
        C1.compare(C3);
        C3.compare(C2);
    }
}
