package prac4.task2;

public class Tie extends Clothes implements ManClothing{
    public Tie(Size size, double price, String color) {
        super(size, price, color);
        this.setType("Галстук");
    }

    @Override
    public void dressMan() {

    }
}
