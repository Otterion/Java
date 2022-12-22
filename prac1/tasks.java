package prac1;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int j=0;j < arr.length;j++) arr[j]=sc.nextInt();

        int sum=0;

        for(int i=0;i < arr.length;i++) sum += arr[i];

        System.out.println("Сумма: " + sum);

        double sr_ar = (double) sum/arr.length;

        System.out.println("Среднее арифметическое: " + sr_ar);

        int k = 0;

        sum=0;

        while (k < arr.length){
            sum += arr[k];
            k++;
        }

        System.out.println("Сумма while: "+sum);
        sum =0;
        k=0;

        do {
            sum += arr[k];
            k++;
        }while (k < arr.length);

        System.out.println("Сумма dowhile: "+sum);

        int m = arr[0];

        for (int i = 1;i < arr.length;i++){
            if(m > arr[i]) m = arr[i];
        }

        System.out.println("Минимальный: "+m);
        m = arr[0];

        for (int i = 1;i < arr.length;i++){
            if(m < arr[i]) m = arr[i];
        }

        System.out.println("Максимальный: "+m);

        System.out.println("\nАргументы: ");

        for (int i = 0; i < args.length; i++) System.out.println(args[i]);
        System.out.println("\nГармонический ряд: ");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.2f ", (double)1/i,"\n");
        }

        System.out.println();
        System.out.println("Введите число");
        m = sc.nextInt();
        int f=1;
        for (int i = 2; i <= m; i++) {
            f*=i;
        }
        System.out.println("Факториал числа "+m+": "+f);
    }
}
