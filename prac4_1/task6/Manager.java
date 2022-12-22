package prac4_1.task6;

public class Manager extends Employer{
    double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome()+averageSum;
    }
}
