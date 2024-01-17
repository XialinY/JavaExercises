package at.technikum.ExamExercise.CarWorkshop;

public abstract class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    abstract int getHourlyRate();

    @Override
    public String toString() {
        return name;
    }
}
