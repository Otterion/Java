package prac4_1.task5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов И.И.",12345, "ИТ", "01.01.1999","89876543210");
        Book book1 = new Book("Л.Н. Толстой", "Война и мир");
        Book book2 = new Book("В.И. Даль", "Толковый словарь живого великорусского языка");
        reader1.takeBook(101);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1,book2);
        reader1.returnBook(101);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(book1,book2);
    }
}
