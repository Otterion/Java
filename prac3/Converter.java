package prac3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Converter {

    public static double DtoU = 6.99;
    public static double EtoU = 6.98;
    public static double DtoE = 0.9993;

    public static NumberFormat currency(int n){
        return switch (n) {
            case 1 -> NumberFormat.getCurrencyInstance(Locale.CHINA);
            case 2 -> NumberFormat.getCurrencyInstance(Locale.US);
            case 3 -> NumberFormat.getCurrencyInstance(Locale.FRANCE);
            default -> NumberFormat.getCurrencyInstance();
        };
    }

    public static String Convert(int n1,int n2,double money){
        n1 = n1*n1 - n2*n2;
        NumberFormat nf = currency(n2);
        double x;
        switch (Math.abs(n1)){
            case 3:
                if (n1 < 0) x = 1/DtoU;
                else x = DtoU;
                return(nf.format(money*x));
            case 5:
                if (n1 > 0) x = 1/DtoE;
                else x = DtoE;
                return(nf.format(money*x));
            case 8:
                if (n1 < 0) x = 1/EtoU;
                else x = EtoU;
                return(nf.format(money*x));
            default:
                return (nf.format(money));
        }
    }
}
