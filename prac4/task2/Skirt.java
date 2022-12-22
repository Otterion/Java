package prac4.task2;

public class Skirt extends Clothes implements WomanClothing{
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
        this.setType("Юбка");
    }

    @Override
    public void dressWoman() {

    }
}
