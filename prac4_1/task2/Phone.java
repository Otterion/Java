package prac4_1.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        number = "Неизвестно";
        model = "Неизвестно";
        weight = 0;
    }

    public void receiveCall(String name){
        System.out.println("\nЗвонит {"+name+"}");
    }

    public void receiveCall(String name, String number){
        System.out.println("\nЗвонит {"+name+" "+number+"}");
    }

    public void sendMessage(String... numbers){
        System.out.println("\nСообщения отправлены на номера:");
        for (String num:
             numbers) {
            System.out.println(num);
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
