package prac3;

import java.text.NumberFormat;
import java.util.Locale;

public class Report {
    private static Employee[] employees;
    private static int count=0;
    private static NumberFormat nf;

    public static void generateReport(){
        for (int i = 0; i < count; i++) {
            System.out.printf("%-30s %15s\n",employees[i].getFullname(),nf.format(employees[i].getSalary()) );
        }
    }

    public static void addEmployee(String fullname, double salary){
        employees[count]=new Employee(fullname,salary);
        count++;
    }

    public static void main(String[] args) {
        employees = new Employee[10];
        nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        addEmployee("Золочевский А.С.", 133700);
        addEmployee("Овчаров Т.В.", 50000);
        addEmployee("Решетняков С.И.", 13000);
        generateReport();
    }
}
