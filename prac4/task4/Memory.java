package prac4.task4;

public class Memory {
    int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                "Гб}";
    }
}
