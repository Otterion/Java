package prac4.task4;

public class Monitor {
    double diagonal;
    int frequency;

    public Monitor(double diagonal, int frequency) {
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                "\", frequency=" + frequency +
                "Гц}";
    }
}
