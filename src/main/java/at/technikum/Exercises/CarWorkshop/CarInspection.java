package at.technikum.Exercises.CarWorkshop;

public class CarInspection implements Job{

    private Car car;
    public CarInspection(Car car) {
        this.car = car;
    }

    private String isNewCar (Car car) {
        if (car.year < 2000) {
            return "old car (" + car + ")";
        }
        return "new car (" + car + ")";
    }

    @Override
    public int getMinNumberOfWorkers() {
        return 2;
    }

    @Override
    public int getMinimumRequiredSenior() {
        return 1;
    }

    @Override
    public double timeRequiredForJob() {return 10;}
    @Override
    public int getBasePrice() {
        if (car.year < 2000){
            return 200;
        }
        return 150;
    }
    @Override
    public String jobType() {
        return "Inspection (" + isNewCar(car) + ")";
    }

    @Override
    public String toString() {
        return "Job: Car Inspection";
    }
}
