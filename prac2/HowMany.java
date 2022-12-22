package prac2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = 1, n = 0;
        while (s.charAt(n)==' ' && n < s.length()){
            n++;
        }
        for (int i = n; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i!=0 && s.charAt(i-1)!=' ')k++;
        }
        System.out.println(k);
    }
}
