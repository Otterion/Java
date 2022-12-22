package prac3;

import java.util.Random;

public class task1_3 {
    public static void main(String[] args) {
        int[] arr=new int[4];
        Random rand = new Random();
        int a=0;
        boolean check = true;

        for (int i = 0; i < 4; i++) {
            arr[i]=rand.nextInt(90)+10;
            //arr[i]=i+10;
            System.out.println(arr[i]);
            if (check) check = (a < arr[i]);
            a = arr[i];
        }
        if (check) System.out.println("Последовательность строго возрастающая");
        else System.out.println("Последовательность не строго возрастающая");
    }
}
