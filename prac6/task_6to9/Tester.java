package prac6.task_6to9;

public class Tester {

    public static void main(String[] args) {
        Printable[] arr = new Printable[10];
        for (int i = 0; i < 5; i++) {
            arr[2*i] = new Book();
            arr[2*i+1] = new Shop();
        }

        for (int i = 0; i < 10; i++) {
            arr[i].print();
        }
    }
}
