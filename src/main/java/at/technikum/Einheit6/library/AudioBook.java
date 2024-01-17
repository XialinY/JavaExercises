package at.technikum.Einheit6.library;

public class AudioBook extends Book {
    private int length;

    public AudioBook (String id, String isbn, Author author, String title, int length) {
        super(id, isbn, author, title);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
