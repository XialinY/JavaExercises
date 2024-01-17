package at.technikum.ExamExercise.Library;

public class Song extends Item{
    private Author author;

    public Song(String title, String id, Author author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public int rentCost() {
        return 15;
    }

    @Override
    public void setRentedBy(Member member) {

    }
}
