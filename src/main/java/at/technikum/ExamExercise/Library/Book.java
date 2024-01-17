package at.technikum.ExamExercise.Library;

public class Book extends Item{

    private Author author;
    private int condition;

    public Book(String title, String id, Author author) {
        super(title, id);
        this.author = author;
    }

    public Book(String title, String id, Author author, int condition) {
        super(title, id);
        this.author = author;
        this.condition = condition;
    }

    @Override
    public int rentCost() {
        return 5;
    }
    @Override
    public void setRentedBy(Member member) {
        rentedBy = member;
    }
}
