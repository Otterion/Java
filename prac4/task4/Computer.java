package prac4.task4;

public class Computer {
    Brand brand;
    Monitor monitor;
    Processor processor;
    Memory memory;

    public Computer(Brand brand, double diagonal, int frequency,int cores, int threads, double rate, int capacity) {
        this.brand = brand;
        this.monitor = new Monitor(diagonal,frequency);
        this.processor = new Processor(cores,threads,rate);
        this.memory = new Memory(capacity);
    }

    @Override
    public String toString() {
        return brand +
                "\n" + monitor +
                "\n" + processor +
                "\n" + memory;
    }
}
