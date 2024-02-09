package at.technikum.Exam;

public class Chapter extends Element{
    private String book;

    public Chapter(String name, String book) {
        super(name);
        this.book = book;
    }

    public String getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "[" + getName() + "]" + " Book " + "(" + book + ")";
    }
}
