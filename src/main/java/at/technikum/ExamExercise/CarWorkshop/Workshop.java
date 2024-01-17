package at.technikum.ExamExercise.CarWorkshop;

import java.util.ArrayList;

public class Workshop{

    private ArrayList<Worker> workers;
    private Job job;
    private double sum = 0;
    private int seniorCount = 0;
    public Workshop() {
        //initializing ArrayList in Constructor (also possible during declaration above; this was suggested by Marvin)
        workers = new ArrayList<>();
    }
    public void addWorker (Worker worker) {
        workers.add(worker);
    }
    public void setContract(Job newJob) {
        this.job = newJob;
    }
    public void printReport () {

        System.out.println("Workshop Report:");
        System.out.println(job);
        System.out.printf("Number of workers required: %d\n", job.getMinNumberOfWorkers());
        System.out.printf("Number of actual workers: %d\n", workers.size());
        System.out.printf("Hours needed: %.2f\n", job.timeRequiredForJob());
        System.out.println("Price:");

        calculations();

        System.out.printf("- %s %d\n", job.jobType(), job.getBasePrice());
        System.out.print("---------------\n");
        System.out.printf("-> %.2f\n", sum + job.getBasePrice());

        System.out.printf("Status: %s\n\n", isPossible());

        if (seniorCount == 0) {
            System.out.println("REASON:" + job.getMinimumRequiredSenior() + "senior worker required.\n");
        }
    }

    private String isPossible(){
        //checking if job is possible
        if (workers.size() >= job.getMinNumberOfWorkers() && seniorCount >= job.getMinimumRequiredSenior()){
            return "POSSIBLE";
        } else return "NOT POSSIBLE";
    }
    private void calculations(){
        //because sum is 'globally' defined - it will be constantly added on top if a new job is added.
        //resetting with 'sum = 0' ensures that the 'old sum' is not considered for the new job
        sum = 0;
        //counting amount of seniors and price required for the job
        //TODO IMPORTANT NOTE loop with 'Worker w : workers' is cleaner and eliminates the call 'workers.get(i)...' at almost each line!
        //'for (Worker w : workers)' == FOR EACH Worker w in the ArrayList workers do: ...
        for (Worker w : workers) {

            //printing format - example: "- Senior (name) __ x 50"
            System.out.printf("- %s %.2f x %d\n", w, job.timeRequiredForJob() / workers.size(), w.getHourlyRate());

            //calculating price based off hourly rate
            sum += (job.timeRequiredForJob() / workers.size()) * w.getHourlyRate();

            //counting amount of total seniors
            //TODO IMPORTANT NOTE 'instanceof' checks if the object is an object of the class 'SeniorWorker' (here, but be used to check for ANY class)
            if (w instanceof SeniorWorker){
                seniorCount++;
            }
        }
    }
}
