package at.technikum.ExamExercise.Library;

public class Director extends Person{
    private String description;

    public Director(String name, int age, String description) {
        super(name, age);
        this.description = description;
    }
}
