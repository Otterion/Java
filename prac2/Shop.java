package prac2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static int count = 0;
    private static ArrayList<Computer> computer = new ArrayList<>();

    public static void addComp(String model, String processor, String videocard, int ram, int hdd, int ssd){
        computer.add(new Computer(model, processor, videocard, ram, hdd, ssd));
        count++;
    }

    public static void findComp(String model, String processor, String videocard, int ram, int hdd, int ssd){
        int i=0;
        for (Computer comp:computer) {
            if ((model.equals("0") || model.equals(comp.getModel())) &&
                    (processor.equals("0") || processor.equals(comp.getProcessor())) &&
                    (videocard.equals("0") || videocard.equals(comp.getVideocard())) &&
                    (ram == 0 || ram == comp.getRam()) &&
                    (hdd == 0 || hdd == comp.getHdd()) &&
                    (ssd == 0 || ssd == comp.getSsd())){
                i++;
                System.out.println(i+". "+comp.toString());
            }
        }
        if (i == 0) System.out.println("Ничего не найдено\n");
    }

    public static void removeComp(String model){
        computer.removeIf(comp -> model.equals(comp.getModel()));
    }

    public static String selectProc(){
        Scanner sc = new Scanner(System.in);
        int var;
        var = sc.nextInt();
        switch (var){
            case 0:
                return "0";
            case 1:
                return "intel core i3";
            case 2:
                return "intel core i5";
            case 3:
                return "intel core i7";
            case 4:
                return "AMD Ryzen 3";
            case 5:
                return "AMD Ryzen 5";
            case 6:
                return "AMD Ryzen 7";
            default:
                return "NONE";
        }
    }

    public static String selectVideo(){
        Scanner sc = new Scanner(System.in);
        int var;
        var = sc.nextInt();
        switch (var){
            case 0:
                return "0";
            case 1:
                return "NVIDIA GeForce GTX 1060";
            case 2:
                return "NVIDIA GeForce RTX 2060";
            case 3:
                return "NVIDIA GeForce RTX 3060";
            case 4:
                return "AMD Radeon R3";
            case 5:
                return "AMD Radeon R5";
            case 6:
                return "AMD Radeon R7";
            default:
                return "NONE";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1, ram,hdd,ssd;
        String model = "0", processor, videocard;
        while (c != 0){
            System.out.println("\n1.Добавить компьютер;\n2.Удалить компьютер;\n3.Найти компьтеры по параметрам;\n0. Выхoд.\nВыберите действие:");
            c = sc.nextInt();
            switch (c){
                case (1):
                    System.out.println("Введите характеристики");
                    System.out.println("Модель:");
                    model = sc.nextLine();
                    model = sc.nextLine();
                    System.out.println("Процессор:" +
                            "\n1. intel core i3;" +
                            "\n2. intel core i5;" +
                            "\n3. intel core i7;" +
                            "\n4. AMD Ryzen 3;" +
                            "\n5. AMD Ryzen 5;" +
                            "\n6. AMD Ryzen 7.");
                    processor = selectProc();
                    System.out.println("Видеокарта:"+
                            "\n1. NVIDIA GeForce GTX 1060;" +
                            "\n2. NVIDIA GeForce RTX 2060;" +
                            "\n3. NVIDIA GeForce RTX 3060;" +
                            "\n4. AMD Radeon R3;" +
                            "\n5. AMD Radeon R5;" +
                            "\n6. AMD Radeon R7.");
                    videocard = selectVideo();
                    System.out.println("Объём ОЗУ(ГБ):");
                    ram = sc.nextInt();
                    System.out.println("Объём HDD(ГБ):");
                    hdd = sc.nextInt();
                    System.out.println("Объём SSD(ГБ):");
                    ssd = sc.nextInt();
                    addComp(model, processor, videocard, ram, hdd, ssd);
                    break;
                case (2):
                    System.out.println("Введите модель компьютера:");
                    model = sc.nextLine();
                    model = sc.nextLine();
                    removeComp(model);
                    break;
                case (3):
                    System.out.println("Введите характеристики(0, если характеристика не важна)");
                    System.out.println("Модель:");
                    model = sc.nextLine();
                    model = sc.nextLine();
                    System.out.println("Процессор:" +
                            "\n0. Любой" +
                            "\n1. intel core i3;" +
                            "\n2. intel core i5;" +
                            "\n3. intel core i7;" +
                            "\n4. AMD Ryzen 3;" +
                            "\n5. AMD Ryzen 5;" +
                            "\n6. AMD Ryzen 7.");
                    processor = selectProc();
                    System.out.println("Видеокарта:"+
                            "\n0. Любая" +
                            "\n1. NVIDIA GeForce GTX 1060;" +
                            "\n2. NVIDIA GeForce RTX 2060;" +
                            "\n3. NVIDIA GeForce RTX 3060;" +
                            "\n4. AMD Radeon R3;" +
                            "\n5. AMD Radeon R5;" +
                            "\n6. AMD Radeon R7.");
                    videocard = selectVideo();
                    System.out.println("Объём ОЗУ(ГБ):");
                    ram = sc.nextInt();
                    System.out.println("Объём HDD(ГБ):");
                    hdd = sc.nextInt();
                    System.out.println("Объём SSD(ГБ):");
                    ssd = sc.nextInt();
                    findComp(model, processor, videocard, ram, hdd, ssd);
                    break;
                default:
                    System.out.println("Такого варианта нет\n");
            }
        }


    }
}