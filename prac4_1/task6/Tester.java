package prac4_1.task6;

import java.text.NumberFormat;
import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        Employer[] array = new Employer[5];
        array[0]=new Employer("Александр", "Александров",350);
        array[1]=new Employer("Иван", "Иванов",250);
        array[2]=new Manager("Илья", "Ильин",400,100);
        array[3]=new Employer("Павел", "Павлов",320);
        array[4]=new Manager("Данил", "Данилович",570, 160);
        System.out.printf("%-15s %-15s %-8s\n","Имя","Фамилия","Зарплата");
        for (Employer obj : array) {
            System.out.printf("%-15s %-15s %-8s\n", obj.getFirstName(), obj.getLastName(), nf.format(obj.getIncome()));
        }
    }
}
