package prac4_1.task5;

public class Reader {
    private String name;
    private long id;
    private String faculty;
    private String birthday;
    private String phone;

    public Reader(String name, long id, String faculty, String birthday, String phone) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String ending(int k){
        if(k % 10 == 1 && k % 100 != 11) return ("у");
        else if (((k % 10) == 2 || (k % 10) == 3 || (k % 10) == 4) && k/10!=1) return ("и");
        return "";
    }

    public void takeBook(int k){
        System.out.println(name+" взял "+k+" книг"+ending(k));
    }

    public void takeBook(String... titles){
        System.out.print(name+" взял книги: ");
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i]);
            if (i != titles.length-1) System.out.print(", ");
        }
        System.out.println();
    }

    public void  takeBook(Book... books){
        System.out.print(name+" взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            if (i != books.length-1) System.out.print(", ");
        }
        System.out.println();
    }

    public void returnBook(int k){
        System.out.println(name+" вернул "+k+" книг"+ending(k));
    }

    public void returnBook(String... titles){
        System.out.print(name+" вернул книги: ");
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i]);
            if (i != titles.length-1) System.out.print(", ");
        }
        System.out.println();
    }

    public void  returnBook(Book... books){
        System.out.print(name+" вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            if (i != books.length-1) System.out.print(", ");
        }
        System.out.println();
    }
}
