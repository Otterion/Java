package prac3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Internet_shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        double[] prices = {0.83,2.68,1.68,1.09,0.5,6.7,5.03,4.19,0.84,0.92};
        int opt=-1, n1 = 2, n2;
        double sum = 0;
        System.out.println("КАТАЛОГ\n" +
                           "1.Хлеб - "+nf.format(prices[0])+";\n" +
                           "2.Молоко - "+nf.format(prices[1])+";\n" +
                           "3.Мука - "+nf.format(prices[2])+";\n" +
                           "4.Сахар - "+nf.format(prices[3])+";\n" +
                           "5.Соль - "+nf.format(prices[4])+";\n" +
                           "6.Курица - "+nf.format(prices[5])+";\n" +
                           "7.Кофе - "+nf.format(prices[6])+";\n" +
                           "8.Чай - "+nf.format(prices[7])+";\n" +
                           "9.Лимон - "+nf.format(prices[8])+";\n" +
                           "10.Картофель - "+nf.format(prices[9])+";\n" +
                           "11.Поменять валюту в каталоге\n" +
                           "0.Перейти к оплате.");
        while (opt != 0){
            opt = sc.nextInt();
            if(opt > 0 && opt < 11) {
                sum+=prices[opt-1];
                System.out.println("Товар добавлен, можно продолжить выбор");
            }else if (opt == 0) {
                nf = Converter.currency(n1);
                System.out.println("Сумма: " + nf.format(sum) +
                                   "\nВыберите валюту которой будете оплачивать:");
            }
            else if (opt == 11) {
                System.out.print("1.Юань;\n2.Доллар;\n3.Евро.\n");
                n2 = sc.nextInt();
                nf = Converter.currency(n2);
                System.out.println("КАТАЛОГ\n" +
                                   "1.Хлеб - "+Converter.Convert(n1,n2,prices[0])+";\n" +
                                   "2.Молоко - "+Converter.Convert(n1,n2,prices[1])+";\n" +
                                   "3.Мука - "+Converter.Convert(n1,n2,prices[2])+";\n" +
                                   "4.Сахар - "+Converter.Convert(n1,n2,prices[3])+";\n" +
                                   "5.Соль - "+Converter.Convert(n1,n2,prices[4])+";\n" +
                                   "6.Курица - "+Converter.Convert(n1,n2,prices[5])+";\n" +
                                   "7.Кофе - "+Converter.Convert(n1,n2,prices[6])+";\n" +
                                   "8.Чай - "+Converter.Convert(n1,n2,prices[7])+";\n" +
                                   "9.Лимон - "+Converter.Convert(n1,n2,prices[8])+";\n" +
                                   "10.Картофель - "+Converter.Convert(n1,n2,prices[9])+";\n" +
                                   "11.Поменять валюту в каталоге\n" +
                                   "0.Перейти к оплате.");
            } else {
                System.out.println("Некоректный выбор");
            }
        }
        System.out.print("1.Юань;\n2.Доллар;\n3.Евро.\n");
        n2 = sc.nextInt();
        System.out.println("К оплате: "+Converter.Convert(n1,n2,sum));
    }
}
