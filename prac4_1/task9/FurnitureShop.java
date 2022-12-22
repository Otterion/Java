package prac4_1.task9;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FurnitureShop {

    public static void main(String[] args) {
        int k = 9;
        Furniture[] products = new Furniture[k];
        ArrayList<Integer>[] array = new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            array[i]=new ArrayList();
        }
        products[0]= new Chair("STUL","Пластик","Красный",20,80);
        products[1]= new Table("KUHNYA","Металл","Серебро",30,"Круг");
        products[2]= new Closet("SHKAF","Дерево","Чёрный",40,2);
        products[3]= new Chair("TABURETKA","Дерево","Красный",50,100);
        products[4]= new Table("COFFEE","Дерево","Чёрный",60,"Квадрат");
        products[5]= new Closet("KUPE","Дерево","Белый",70,3);
        products[6]= new Chair("KRESLO","Ткань","Чёрный",80,200);
        products[7]= new Table("GamerProSuperStolRGB","Кожа","Чёрный",150,"Шестиугольник");
        products[8]= new Closet("Little","Дерево","Коричневый",50,1);

        for (int i = 0;i < k;i++) {
            array[products[i].type-1].add(i);
        }

        Scanner sc = new Scanner(System.in);
        int c;
        c = 1;
        System.out.println("\nСтулья и кресла:");
        for (int i : array[0]) {
            System.out.println(c+". "+products[i]);
            c++;
        }
        System.out.println("\nСтолы:");
        for (int i : array[1]) {
            System.out.println(c+". "+products[i]);
            c++;
        }
        System.out.println("\nШкафы:");
        for (int i : array[2]) {
            System.out.println(c+". "+products[i]);
            c++;
        }

        double summa = 0;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        do {
            System.out.print("\nВыберите мебель для покупки или 0 для выхода:");
            c = sc.nextInt();
            if (c > 0 && c <= array[0].size())
                summa += products[array[0].get(c-1)].price;
            else if (c > array[0].size() && c <= array[0].size()+array[1].size())
                summa += products[array[1].get(c - array[0].size() -1)].price;
            else if (c > array[2].size() && c <= array[0].size()+array[1].size()+array[2].size())
                summa += products[array[2].get(c - array[0].size() - array[1].size() - 1)].price;
            else if(c == 0) System.out.println("К оплате: "+nf.format(summa));
            else System.out.println("Некоректный ввод!");
            if (c > 0 && c <= k) System.out.println("Товар добавлен в корзину("+nf.format(summa)+")");
        }while (c != 0);
    }

}
