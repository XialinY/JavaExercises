package at.technikum.Exercises.ExamExercise;

public class Concert extends Event{

    public Performer performer;

    public Concert(String title, String description, Performer performer) {
        super(title, description);
        this.performer = performer;
    }

    @Override
    public String getDetails() {
        return "Concert: \n" + getTitle() + getDescription() + "\n";
    }

}
