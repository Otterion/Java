package prac4_1.task10;

public class Ship extends Transport{


    public Ship(double averageSpeed, double priceF, double priceP, String company) {
        super(averageSpeed, priceF, priceP, company);
    }

    @Override
    public double time(double distance) {
        return (distance/averageSpeed);
    }

    @Override
    public double priceFreight(double distance, double weight) {
        return (distance*priceF*(weight/10000+1))/10;
    }

    @Override
    public double pricePassenger(double distance) {
        return distance*priceP/10;
    }
}
