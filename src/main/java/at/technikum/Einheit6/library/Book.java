package at.technikum.Einheit6.library;

public abstract class Book extends Item{ //builds Book based off of Item
    private String isbn;
    private Author author;
    private String title;

    public Book (String id, String isbn, Author author, String title) {
        super(id); //TODO calls for the id variable inside Item
        setAuthor(author);
        setIsbn(isbn);
        setTitle(title);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
