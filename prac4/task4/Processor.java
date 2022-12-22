package prac4.task4;

public class Processor {
    int cores;
    int threads;
    double rate;

    public Processor(int cores, int threads, double rate) {
        this.cores = cores;
        this.threads = threads;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "cores=" + cores +
                ", threads=" + threads +
                ", rate=" + rate +
                "ГГц}";
    }
}
