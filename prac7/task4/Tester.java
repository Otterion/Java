package prac7.task4;

public class Tester {

    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc(5,13);
        System.out.println(mathFunc.modul());
        mathFunc.power(9);
        System.out.println(mathFunc.circleLength(10));
    }
}
