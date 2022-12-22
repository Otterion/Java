package prac3;

import java.util.Random;
import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n,j=0,k=0;
        do {
            System.out.println("Введите длину массива:");
            n = sc.nextInt();
            if (n<0) System.out.println("Некоректное значение, введите заново");
        }while (n < 0);
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=rand.nextInt(n);
            System.out.print(arr1[i]+" ");
            if (arr1[i]%2==0)k++;
        }
        System.out.println();
        if (k!=0){
            int[] arr2 = new int[k];
            for (int i = 0; i < n; i++) {
                if (arr1[i]%2==0){
                    arr2[j]=arr1[i];
                    System.out.print(arr1[i]+" ");
                    j++;
                }
            }
        }
    }
}
