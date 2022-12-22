package prac2;

public class Revers {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        for (String value : arr) {
            System.out.print(value + " ");
        }
        String temp;
        int l = arr.length;
        for (int i = 0; i < l/2; i++) {
            temp = arr[i];
            arr[i] =  arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        System.out.println();
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
