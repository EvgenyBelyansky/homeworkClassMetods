public class App {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book evgenyOnegin = new Book("Евгений Онегин", pushkin, 1833);
        Book kazaki = new Book("Казаки", tolstoy, 1863);

    }
}