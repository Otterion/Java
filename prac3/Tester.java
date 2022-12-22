package prac3;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    private static int count;
    private static Circle[] arr;

    public static void main(String[] args) {
        Random rand = new Random();
        arr = new Circle[10];
        count = 0;
        int n,k;
        double mR;
        Scanner sc = new Scanner(System.in);
        while (count < 10){
            System.out.println("\nВыбирите действие\n1.Создать окружность;\n2.Наименьшая окружность;\n3.Наибольшая окружность.");
            n = sc.nextInt();
            if (n == 1){
                double x = rand.nextDouble()*1000;
                double y = rand.nextDouble()*1000;
                double r = rand.nextDouble()*1000+1;
                arr[count]= new Circle(x,y,r);
                System.out.printf("Создана окружность радусом: %.2f\n", r);
                count++;
            }else if(n == 2){
                mR = Double.MAX_VALUE;
                k = 1;
                for (int i = 0; i < count; i++) {
                    if(arr[i].getR()<=mR) {
                        mR=arr[i].getR();
                        k=i+1;
                    }
                }
                System.out.println("Наименьшая окружность под номером "+k);
            }else if(n == 3){
                mR = -1;
                k = 1;
                for (int i = 0; i < count; i++) {
                    if(arr[i].getR()>mR) mR=arr[i].getR();
                    k=i;
                }
                System.out.println("Наибольшая окружность под номером "+k);
            }
        }
    }
}
