package wyjatki.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
       this.books.add(book);

    }

    public void removeBook(String isbn) throws NoBookFoundException{
        for (Book book : books) {
            if(book.getIsbn().equals(isbn));
            this.books.remove(book);
            return;
        }
        throw new NoBookFoundException("Nie można usunac ksiazki o numberze isbn: " + isbn);
    }

    public List<Book> getBooksFromTitle(String title) throws NoBookFoundException{
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                booksByTitle.add(book);
            }
        }
        if (booksByTitle.isEmpty()){
            throw new NoBookFoundException("Nie mozna znalezc tytulu: " + title);
        }
        return booksByTitle;
    }

    public Book getBookFromIsbn(String isbn) throws NoBookFoundException{
        for (Book book : books) {
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        throw new NoBookFoundException("Nie mozna znalezc ksiazki o podanym isbn: " + isbn);

    }






}
