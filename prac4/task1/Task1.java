package prac4.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("1 - Лето\n2 - Осень\n3 - Зима\n4 - Весна");
        System.out.print("Выберите время года:");
        Seasons favorite = Seasons.SUMMER;
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            switch (n){
                case 1 -> favorite = Seasons.SUMMER;
                case 2 -> favorite = Seasons.AUTUMN;
                case 3 -> favorite = Seasons.WINTER;
                case 4 -> favorite = Seasons.SPRING;
                default -> System.out.println("Нет такого варианта!");
            }
        }while (n > 4 || n < 1);

        System.out.println();
        favorite.getName();

        favorite.info();

        favorite.favSeason();

        favorite.getDescription();

        System.out.println("\n________________________________________");
        for (Seasons season : Seasons.values()){
            season.getName();
            System.out.println("Средняя температура: "+season.getSrTemp());
            season.info();
            System.out.println("________________________________________");
        }
    }
}
