package at.technikum.Exercises.ExamExercise;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    private String stageName;
    public List<PerformanceSlot> performanceSlots = new ArrayList<>();

    public Stage(String stageName) {
        this.stageName = stageName;
    }


    public void addPerformanceSlot(PerformanceSlot performanceSlot){
        performanceSlots.add(performanceSlot);
    }

    public void listPerformances(){
        System.out.println("Stage: " + stageName);
        System.out.println("Performances:");
        for (PerformanceSlot p : performanceSlots){
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Stage:" + stageName + "\n" +
                "performanceSlots:\n" + performanceSlots + "\n";
    }
}
