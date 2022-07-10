package wyjatki.zadanie2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("78434", "babla", "H. pęk", 2009);
        //System.out.println(book1);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(new Book("1234", "Ogniem i Mieczem", "H. Sienkiewicz", 1884));




        try{
            bookRepository.getBooksFromTitle("Ogniem i Miem");
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            bookRepository.getBookFromIsbn("12342354");
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            bookRepository.removeBook("9754");
        } catch (NoBookFoundException e) {
            System.out.println("czemu sie to nie chce wyswietlic?!");

        }


    }
}
