package prac4_1.task4;

import java.util.Random;

public class tester {
    public static void main(String[] args) {
        int a1 = 5,b1 = 3,a2 = 3,b2 = 5;
        Matrix matrix1 = new Matrix(a1,b1);
        Matrix matrix2 = new Matrix(a2,b2);
        Matrix matrix3 = new Matrix(a1,b1);
        Random rand = new Random();

        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b1; j++) {
                matrix1.array[i][j] = rand.nextInt(9)+1;
                matrix3.array[i][j] = rand.nextInt(9)+1;
            }
        }
        for (int i = 0; i < a2; i++) {
            for (int j = 0; j < b2; j++) {
                matrix2.array[i][j] = rand.nextInt(9)+1;
            }
        }
        System.out.println("Сложение:");
        matrix1.display();
        matrix3.display();
        matrix1.summa(matrix3);
        matrix1.display();

        System.out.println("Умножение на число:");
        matrix1.display();
        matrix1.multNumber(5);
        matrix1.display();

        System.out.println("Умножение матриц:");
        matrix3.display();
        matrix2.display();
        matrix3.multMatrix(matrix2);;
    }
}
