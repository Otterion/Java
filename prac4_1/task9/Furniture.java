package prac4_1.task9;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Furniture {
    protected String model;
    protected String material;
    protected String color;
    protected double price;
    protected int type;
    NumberFormat nf;

    public Furniture(String model, String material, String color, double price) {
        this.model = model;
        this.material = material;
        this.color = color;
        this.price = price;
        nf = NumberFormat.getCurrencyInstance(Locale.US);
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "model='" + model + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
