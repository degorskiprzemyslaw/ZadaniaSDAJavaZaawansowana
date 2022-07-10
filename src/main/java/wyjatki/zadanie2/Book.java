package wyjatki.zadanie2;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private int releaseDate;

    public Book(String isbn, String title, String author, int releaseDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
