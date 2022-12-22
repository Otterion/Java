package prac2;

import java.util.Scanner;

public class Tester {
    private static int count;
    private static Circle[] arr = new Circle[10];

    public static void main(String[] args) {
        count = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        while (count < 10){
            System.out.println("\nВыбирите действие\n1.Создать окружность;\n2.Узнать колличество окружностей.");
            n = sc.nextInt();
            if (n == 1){
                System.out.println("Введите координаты центра окружности и её радиус:");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double r = sc.nextDouble();
                arr[count]= new Circle(x,y,r);
                count++;
            }else if(n == 2){
                System.out.println("Количество окружностей:"+count);
            }
        }
    }
}
