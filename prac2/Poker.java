package prac2;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] suit = {"♠","♥","♣","♦"};
        String[] value = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int[] arr = new int[52];
        for (int i = 0; i < 52; i++) {
            arr[i] = i;
        }
        Random rnd = new Random();
        int j, temp;
        for (int i = 0; i < 52; i++) {
            for (int k = 0; k < 5; k++) {
                j = rnd.nextInt(52);
                temp = arr[i];
                arr[i] =  arr[j];
                arr[j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(".-----.   .-----.   .-----.   .-----.   .-----.");
            System.out.printf("|%-5s|   |%-5s|   |%-5s|   |%-5s|   |%-5s|\n",value[(arr[i*5]-1)/4],value[(arr[i*5+1])/4],value[(arr[i*5+2])/4],value[(arr[i*5+3])/4],value[(arr[i*5+4])/4]);
            System.out.printf("|  %s  |   |  %s  |   |  %s  |   |  %s  |   |  %s  |\n",suit[arr[i*5]%4],suit[arr[i*5+1]%4],suit[arr[i*5+2]%4],suit[arr[i*5+3]%4],suit[arr[i*5+4]%4]);
            System.out.printf("|%5s|   |%5s|   |%5s|   |%5s|   |%5s|\n",value[(arr[i*5]-1)/4],value[(arr[i*5+1])/4],value[(arr[i*5+2])/4],value[(arr[i*5+3])/4],value[(arr[i*5+4])/4]);
            System.out.println("'-----'   '-----'   '-----'   '-----'   '-----'");
            System.out.println();
        }
        //.-----.
        //|2    |
        //|  ♠  |
        //|    2|
        //'-----'
    }
}
