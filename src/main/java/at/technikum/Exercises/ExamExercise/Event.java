package at.technikum.Exercises.ExamExercise;

public abstract class Event {

    private String title;
    private String description;

    public Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public abstract String getDetails();

}
