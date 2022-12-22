package prac6.task_10;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        int c;
        do {
            System.out.println("________\nВыберите действие:\n1. Добавить компьютер\n2. Удалить компьютер\n3. Найти компьютер\n4. Вывести компьютеры");
            c = sc.nextInt();
            switch (c){
                case 1 -> shop.addComp();
                case 2 -> {
                    System.out.println("Введите номер удаляемого компьютера: ");
                    c = sc.nextInt();
                    shop.delete(c);
                }
                case 3 -> shop.find();
                case 4 -> shop.print();
            }
        }while (c != 0);
    }
}
