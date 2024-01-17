package at.technikum.Vorlesung6.library;

public class Movie extends Item {
    private String title;
    private int rating;

    public Movie (String id, String title) {
        super(id);
        setTitle(title);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
