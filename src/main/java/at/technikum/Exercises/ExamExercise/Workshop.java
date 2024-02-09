package at.technikum.Exercises.ExamExercise;

public class Workshop extends Event{
    public String instructor;

    public Workshop(String title, String description, String instructor) {
        super(title, description);
        this.instructor = instructor;
    }

    @Override
    public String getDetails() {
        return "Workshop: \n" + getTitle() + getDescription() + "\n";
    }
}
