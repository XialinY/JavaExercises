package at.technikum.ExamExercise.Library;

public class Movie extends Item{
    private Director director;

    public Movie(String title, String id, Director director) {
        super(title, id);
        this.director = director;
    }

    @Override
    public int rentCost() {
        return 10;
    }

    @Override
    public void setRentedBy(Member member) {

    }
}
