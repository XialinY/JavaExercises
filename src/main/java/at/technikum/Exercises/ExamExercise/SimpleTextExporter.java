package at.technikum.Exercises.ExamExercise;

public class SimpleTextExporter implements Exporter{


    public void getMessage(){
        System.out.println("The schedule is empty!");
    }
    @Override
    public void export(FestivalSchedule festivalSchedule) throws IllegalArgumentException {
        if (festivalSchedule.isEmpty()){
            throw new IllegalArgumentException("The schedule is empty!");
        } else {
            System.out.println("Exporting schedule...");
            festivalSchedule.printSchedule();
        }
    }
}
