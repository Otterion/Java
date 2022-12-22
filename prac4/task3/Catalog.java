package prac4.task3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public enum Catalog {
    MEAT("Мясо"),
    BREAD("Хлеб"),
    FISH("Рыба"),
    WATER("Вода"),
    FROZEN("Замороженые продукты")
    ;

    private final String title;
    private final ArrayList<String> productList = new ArrayList<>();
    private final ArrayList<Double> priceList = new ArrayList<>();
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    Catalog(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void add(String title, double price){
        productList.add(title);
        priceList.add(price);
    }
    
    public void printCatalog(){
        int k = 1;
        System.out.println(title+":");
        for (int i = 0; i < priceList.size();i++) {
            System.out.println(k + ". " + productList.get(i) + " - " + nf.format(priceList.get(i)));
            k++;
        }
    }

    public double getPrice(int i){
        if (i <= 0 || i > priceList.size()){
            System.out.println("Нет такого варианта!");
            return 0;
        }
        System.out.println("Товар добавлен");
        return priceList.get(i-1);
    }
}
