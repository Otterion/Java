package prac2;

public class Computer {
    private String model, processor, videocard;
    private int ram, hdd, ssd;

    public Computer(String model, String processor, String videocard, int ram, int hdd, int ssd) {
        this.model = model;
        this.processor = processor;
        this.videocard = videocard;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "model: '" + model + '\'' +
                ", processor: '" + processor + '\'' +
                ", videocard: '" + videocard + '\'' +
                ", ram: " + ram +
                " Gb, hdd: " + hdd +
                " Gb, ssd: " + ssd + " Gb";
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public String getVideocard() {
        return videocard;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getSsd() {
        return ssd;
    }
}
