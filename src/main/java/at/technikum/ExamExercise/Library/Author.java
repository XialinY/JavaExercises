package at.technikum.ExamExercise.Library;

public class Author extends Person{

    private String description;

    public Author(String name, int age, String description) {
        super(name, age);
        this.description = description;
    }

}
