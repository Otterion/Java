package prac6.task_10;

public class Computer {
    Memory memory;
    Processor processor;
    Monitor monitor;
    Brand brand;

    public Computer(Memory memory, Processor processor, Monitor monitor, Brand brand) {
        this.memory = memory;
        this.processor = processor;
        this.monitor = monitor;
        this.brand = brand;
    }
    public Boolean check(String titleP, int amount, String titleM, Brand brand){
        return (memory.getAmount() == amount)&&(processor.getTitle().equals(titleP))&&(monitor.getTitle().equals(titleM))&&(this.brand == brand);
    }
    public void print(){
        System.out.println("Брэнд: "+brand+"\nПроцессор: "+processor.getTitle()+"\nПамять:"+memory.getAmount()+" ГБ\nМонитор: "+monitor.getTitle());
    }
}
