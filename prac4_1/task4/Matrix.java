package prac4_1.task4;

public class Matrix {
    int[][] array;
    int a,b;

    public Matrix(int a, int b) {
        this.a = a;
        this.b = b;
        array = new int[a][b];
    }

    void displayArray(int[][] array, int a,int b){
        char[] brackets = {'/','\\','|'};
        for (int i = 0; i < a; i++) {
            if (i == 0)System.out.print(brackets[0]);
            else if(i == a-1)System.out.print(brackets[1]);
            else System.out.print(brackets[2]);

            for (int j = 0; j < b; j++) {
                System.out.printf("%3d ",array[i][j]);
            }
            if (i == 0)System.out.println(brackets[1]);
            else if(i == a-1)System.out.println(brackets[0]);
            else System.out.println(brackets[2]);
        }
        System.out.println();
    }

    public void display(){
        displayArray(array,a,b);
    }

    public void summa(Matrix matrix){
        if (a == matrix.a && b == matrix.b){
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    array[i][j] += matrix.array[i][j];
                }
            }
        }
    }

    public void multNumber(int x){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] *= x;
            }
        }
    }

    public void multMatrix(Matrix matrix){
        if (b == matrix.a){
            int[][] result = new int[a][matrix.b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < matrix.b; j++) {
                    for (int k = 0; k < b; k++) {
                        result[i][j] += array[i][k]*matrix.array[k][j];
                    }
                }
            }

            displayArray(result, a, matrix.b);
        }else System.out.println("Матрицы невозможно умножить!");
    }

}
