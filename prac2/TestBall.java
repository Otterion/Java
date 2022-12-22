package prac2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        b.setXY(1,3);
        b.move(10,10);
        System.out.println(b.toString());
    }
}
