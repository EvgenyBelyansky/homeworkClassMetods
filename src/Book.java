public class Book {
    private String title;

    private Author author;

    private int yearOfPublishing;

    public Book(String title, Author author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int year) {
        year = yearOfPublishing;
    }

    public String toString() {
        return "Книга " + title +
                " автор " + author +
                " год публикации " + yearOfPublishing;
    }
}
