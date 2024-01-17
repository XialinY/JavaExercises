package at.technikum.ExamExercise.CarWorkshop;

public class JuniorWorker extends Worker{

    public JuniorWorker(String name) {
        super(name);
    }

    @Override
    int getHourlyRate() {
        return 20;
    }


    @Override
    public String toString() {
        return "Junior (" + super.toString() + ")";
    }
}
