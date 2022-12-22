package prac4_1.task10;

public abstract class Transport {
    double averageSpeed;
    double priceF,priceP;
    String company;

    public Transport(double averageSpeed, double priceF, double priceP, String company) {
        this.averageSpeed = averageSpeed;
        this.priceF = priceF;
        this.priceP = priceP;
        this.company = company;
    }

    public abstract double time(double distance);
    public abstract double priceFreight(double distance, double weight);
    public abstract double pricePassenger(double distance);

    public String getCompany() {
        return company;
    }
}
