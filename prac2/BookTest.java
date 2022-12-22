package prac2;

public class BookTest {
    public static void main(String[] args) {
        BookShelf polka = new BookShelf();
        polka.addBook("Тамара Михеева","Доплыть до грота",2018);
        polka.addBook("Карл Маркс","Капитал",1867);
        polka.addBook("Рэй Брэдбери","451 градус по Фаренгейту",1953);
        polka.addBook("Джордж Оруэлл","1984",1948);
        polka.addBook("Харпер Ли","Убить пересмешника",1960);
        polka.printBooks();
        polka.bookSort();
        System.out.println();
        polka.printBooks();
    }
}
