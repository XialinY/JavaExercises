package at.technikum.Exercises.ExamExercise;

import java.util.ArrayList;
import java.util.List;

public class FestivalSchedule {
    private boolean isEmpty = false;
    public List<Stage> stages = new ArrayList<>();

    public void addStage(Stage stage){
        stages.add(stage);
    }

    public boolean isEmpty(){
        if (stages.isEmpty()){
            return true;
        }
        return isEmpty;
    }

    public void printSchedule(){
        if (isEmpty()){
            System.out.println("The schedule is empty!");
        } else {
            System.out.println("The schedule is not empty\nHere is the upcoming schedule:");
            for (Stage s : stages) {
                s.listPerformances();
            }
        }
    }
}
