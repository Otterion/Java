package prac4_1.task10;

import java.text.NumberFormat;
import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        Transport[] arr = new Transport[4];
        arr[0]=new Car(70,2,0.5,"Профи");
        arr[1]=new Plane(500, 3,2,"Аэро");
        arr[2]=new Train(140,5,1,"РЖД");
        arr[3]=new Ship(50,6,2,"ВодГруз");

        double d = 1000.0, w = 100;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        for (Transport obj : arr) {
            System.out.printf("%s\nВремя: %.2f часов\nСтоимость грузоперевозки: %s\nСтоимость перевозки пассажира: %s\n\n",
                    obj.getCompany(),obj.time(d),nf.format(obj.priceFreight(d,w)) ,nf.format(obj.pricePassenger(d)) );
        }
    }
}
