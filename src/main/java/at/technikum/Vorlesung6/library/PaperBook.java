package at.technikum.Vorlesung6.library;

public class PaperBook extends Book {
    private int pages;

    public PaperBook(String id, String isbn, Author author, String title, int pages) {
        super(id, isbn, author, title);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
