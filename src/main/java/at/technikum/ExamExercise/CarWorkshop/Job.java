package at.technikum.ExamExercise.CarWorkshop;

public interface Job {

    int getMinNumberOfWorkers();
    int getBasePrice();
    double timeRequiredForJob();
    String jobType();
    int getMinimumRequiredSenior();
}
