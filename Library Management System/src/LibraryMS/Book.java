package LibraryMS;

public class Book {
    public String title;
    public String author;
    public String isbn;
    public int copiesAvailable;

    public Book(String title, String author, String isbn, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;


    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    void setCopiesAvailable(int copiesAvailable) {

        this.copiesAvailable = copiesAvailable;
    }
}

