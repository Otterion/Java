package prac4_1.task2;

public class Tester {

    public static void main(String[] args) {
        Phone s = new Phone("81234567890", "Samsung Z Failed", 300);
        Phone i = new Phone("80987654321", "IPhone Pro100", 250);
        Phone x = new Phone("81234512345", "Xiaomi Minsk", 200);

        System.out.println(s);
        System.out.println(i);
        System.out.println(x);

        s.receiveCall("Иван");
        System.out.println(s.getNumber());
        i.receiveCall("Олег");
        System.out.println(i.getNumber());
        x.receiveCall("Катя");
        System.out.println(x.getNumber());

        s.receiveCall("Иван", "81234567890");

        x.sendMessage("81234567890","80987654321");

    }
}
