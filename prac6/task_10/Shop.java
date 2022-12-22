package prac6.task_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Computer> array = new ArrayList<>();
    private int count = 0;

    public int getCount() {
        return count;
    }
    public void print(){
        for (int i = 0; i < array.size(); i++) {
            System.out.println(i+1+". ");
            array.get(i).print();
        }
    }

    public void addComp(){
        int c,amount;
        String titleP, titleM;
        Brand brand;
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирите брэнд:\n1.ASUS\n2.DEXP\n3.LENOVO\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> brand = Brand.ASUS;
            case 2 -> brand = Brand.DEXP;
            default -> brand = Brand.LENOVO;
        }
        System.out.println("Выбирите процессор:\n1.intel core i3\n2.intel core i5\n3.intel core i7\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> titleP = "intel core i3";
            case 2 -> titleP = "intel core i5";
            default -> titleP = "intel core i7";
        }
        System.out.println("Выбирите монитор:\n1.Samsung\n2.Acer\n3.Philips\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> titleM = "Samsung";
            case 2 -> titleM = "Acer";
            default -> titleM = "Philips";
        }
        System.out.println("Выбирите количество памяти:\n1. 4 ГБ\n2. 6 ГБ\n3. 8 ГБ\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> amount = 4;
            case 2 -> amount = 6;
            default -> amount = 8;
        }
        array.add(new Computer(new Memory(amount),new Processor(titleP),new Monitor(titleM),brand));
        count++;
    }

    public void delete(int n){
        if (n-1 <= array.size() && n > 0 ) {
            array.remove(n - 1);
            count--;
        }else System.out.println("Такого компьютера нет");
    }

    public void find(){
        int c, amount;
        String titleP, titleM;
        Brand brand;
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирите желаемый брэнд:\n1.ASUS\n2.DEXP\n3.LENOVO\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> brand = Brand.ASUS;
            case 2 -> brand = Brand.DEXP;
            default -> brand = Brand.LENOVO;
        }
        System.out.println("Выбирите желаемый процессор:\n1.intel core i3\n2.intel core i5\n3.intel core i7\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> titleP = "intel core i3";
            case 2 -> titleP = "intel core i5";
            default -> titleP = "intel core i7";
        }
        System.out.println("Выбирите желаемый монитор:\n1.Samsung\n2.Acer\n3.Philips\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> titleM = "Samsung";
            case 2 -> titleM = "Acer";
            default -> titleM = "Philips";
        }
        System.out.println("Выбирите желаемое количество памяти:\n1. 4 ГБ\n2. 6 ГБ\n3. 8 ГБ\n");
        c = sc.nextInt();
        switch (c){
            case 1 -> amount = 4;
            case 2 -> amount = 6;
            default -> amount = 8;
        }
        Boolean found = false;

        int k = -1;
        while (!found && k+1 < array.size()){
            k++;
            found = array.get(k).check(titleP,amount,titleM,brand);
        }
        if(found){
            System.out.println("Найдено по запросу:\n");
            array.get(k).print();
        }
        else System.out.println("Ничего не найдено");
    }
}
