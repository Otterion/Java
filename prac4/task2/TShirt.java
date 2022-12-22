package prac4.task2;

public class TShirt extends Clothes implements ManClothing,WomanClothing{


    public TShirt(Size size, double price, String color) {
        super(size, price, color);
        this.setType("Футболка");
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
