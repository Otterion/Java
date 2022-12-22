package prac4_1.task9;

public class Table extends Furniture{
    protected String shape;

    public Table(String model, String material, String color, double price,String shape) {
        super(model, material, color, price);
        this.shape = shape;
        super.type = 2;
    }

    @Override
    public String toString() {
        return "Модель: " + model +
                ", Материал: " + material +
                ", Цвет: " + color +
                ", Форма " + shape+
                ", Цена: " + nf.format(price);
    }
}
