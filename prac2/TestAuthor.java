package prac2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Алексей", "a@mail.ru",'m');
        System.out.println(author);
        author.setEmail("new@mail.ru");
        System.out.println(author);
    }
}
