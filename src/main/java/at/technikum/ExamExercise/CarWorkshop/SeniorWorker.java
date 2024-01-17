package at.technikum.ExamExercise.CarWorkshop;

public class SeniorWorker extends Worker{
    public SeniorWorker(String name) {
        super(name);
    }

    @Override
    int getHourlyRate() {
        return 50;
    }

    @Override
    public String toString() {
        return "Senior (" + super.toString() + ")";

    }
}
