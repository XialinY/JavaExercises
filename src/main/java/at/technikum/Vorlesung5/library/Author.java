package at.technikum.Vorlesung5.library;

public class Author {
    private String name;

    public Author(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
