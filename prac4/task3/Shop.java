package prac4.task3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static ArrayList<String[]> users;
    public static ArrayList<Integer> bag;

    public static void autorize(){
        users = new ArrayList<>();
        users.add(new String[]{"user","password"});
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.println("\n1.Войти\n" +
                    "2.Зарегистрироваться");
            c = sc.nextInt();
            System.out.println(sc.nextLine());

            String login, password;
            boolean exist = false;

            if (c == 1){
                while (!exist){
                    System.out.print("Логин: ");
                    login = sc.nextLine();
                    System.out.print("Пароль: ");
                    password = sc.nextLine();
                    for (String[] user :
                            users) {
                        if (login.equals(user[0]) && password.equals(user[1])){
                            exist = true;
                            break;
                        }
                    }
                    if (!exist) System.out.println("Неверный логин или пароль!");
                }
            }
            else if(c == 2) {
                System.out.print("Придумайте логин: ");
                login = sc.nextLine();
                System.out.print("Придумайте пароль: ");
                password = sc.nextLine();
                users.add(new String[]{login,password});
                System.out.println("\nВы успешно зарегистрировались!");
            }
            else System.out.println("Нет такого варианта!");
        }while (c != 1);

        System.out.println("\nВы успешно авторизировались!");
    }

    public static void main(String[] args) {
        autorize();

        int c,t;
        double summa = 0;
        Boolean exit = false;
        Catalog choice;
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        choice = Catalog.MEAT;
        choice.add("Свинина", 1);
        choice.add("Курица", 2);
        choice.add("Говядина", 3);
        choice = Catalog.BREAD;
        choice.add("Светлый", 0.5);
        choice.add("Ржаной", 0.6);
        choice.add("Лаваш", 1);
        choice = Catalog.FISH;
        choice.add("Форель", 4.5);
        choice.add("Сельдь", 1.5);
        choice.add("Сёмга", 5.2);
        choice = Catalog.WATER;
        choice.add("Dr.Pepper", 1.5);
        choice.add("Натахтари", 2);
        choice.add("Байкал", 2.5);
        choice = Catalog.FROZEN;
        choice.add("Пельмени", 5);
        choice.add("Наггетсы", 4);
        choice.add("Пицца", 2.6);

       do{
            c = 1;
            System.out.println("\nВыберите каталог:");
            for (Catalog catalog :
                    Catalog.values()) {
                System.out.println(c + ". "+catalog.getTitle());
                c++;
            }
            System.out.println("0. Перейти в корзину ("+nf.format(summa)+")");
           c = sc.nextInt();
           System.out.println(sc.nextLine());

           if (c != 0) {
               System.out.println("Выберите товары");

               switch (c){
                   case 1 -> choice = Catalog.MEAT;
                   case 2 -> choice = Catalog.BREAD;
                   case 3 -> choice = Catalog.FISH;
                   case 4 -> choice = Catalog.WATER;
                   case 5 -> choice = Catalog.FROZEN;
                   default -> System.out.println("Нет такого варианта!");
               }

               choice.printCatalog();
               System.out.println("0. Назад");
               do {

                   t = sc.nextInt();
                   System.out.print(sc.nextLine());

                   if(t > 0){
                       summa += choice.getPrice(t);
                   }
               }while (t != 0);
           }
        } while (c != 0);
        System.out.println("К оплате: "+nf.format(summa));
    }

}
