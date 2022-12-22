package prac4.task2;

public class Pants extends Clothes implements ManClothing,WomanClothing{
    public Pants(Size size, double price, String color) {
        super(size, price, color);
        this.setType("Штаны");
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
