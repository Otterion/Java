package prac4_1.task9;

public class Closet extends Furniture{

    protected int doorsNumber;

    public Closet(String model, String material, String color, double price,int doorsNumber) {
        super(model, material, color, price);
        this.doorsNumber = doorsNumber;
        super.type = 3;
    }@Override
    public String toString() {
        return "Модель: " + model +
                ", Материал: " + material +
                ", Цвет: " + color  +
                ", Число дверей: " + doorsNumber+
                ", Цена: " + nf.format(price);
    }
}
