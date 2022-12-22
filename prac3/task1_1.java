package prac3;

import java.util.Random;

public class task1_1 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr1[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 10; i++) {
            arr2[i] = (int) (Math.random()*100);
        }
        for (int x :
                arr1) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int x :
                arr2) {
            System.out.print(x+" ");
        }
    }
}
