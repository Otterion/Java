package prac4_1.task9;

public class Chair extends Furniture{
    protected double load;
    public Chair(String model, String material, String color, double price,double load) {
        super(model, material, color, price);
        this.load = load;
        super.type = 1;
    }

    @Override
    public String toString() {
        return "Модель: " + model +
                ", Материал: " + material +
                ", Цвет: " + color +
                ", Макс. нагрузка: " + load +
                ", Цена: " + nf.format(price);
    }
}
