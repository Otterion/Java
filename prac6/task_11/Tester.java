package prac6.task_11;

public class Tester {
    public static void main(String[] args) {
        double t=20;
        Fahrenheit f = new Fahrenheit();
        Kelvin k = new Kelvin();
        System.out.println("Цельсий: "+t);
        System.out.println("Фаренгейт: "+f.convert(t));
        System.out.println("Кельвин: "+k.convert(t));
    }
}
