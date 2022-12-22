package prac4.task2;

import java.text.ChoiceFormat;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Clothes {
    private String type;
    private Size size;
    private double price;
    private String color;

    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return type +
                "\nРазмер: " + size +
                "\nЦена: " + nf.format(price) +
                "\nЦвет: " + color+"\n";
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
