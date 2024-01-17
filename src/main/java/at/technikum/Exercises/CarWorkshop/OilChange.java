package at.technikum.Exercises.CarWorkshop;

public class OilChange implements Job{

    private Car car;
    public OilChange(Car car) {
        this.car = car;
    }
    @Override
    public int getMinNumberOfWorkers() {
        return 3;
    }

    private String isNewCar (Car car) {
        if (car.year < 2000) {
            return "old car (" + car + ")";
        }
        return "new car (" + car + ")";
    }

    @Override
    public double timeRequiredForJob() {
        return 10;
    }

    @Override
    public String jobType() {
        return "Oil Change (" + isNewCar(car) + ")";
    }

    @Override
    public int getBasePrice() {
        if (car.year < 2000){
            return 300;
        }
        return 200;
    }

    @Override
    public int getMinimumRequiredSenior() {
        return 1;
    }

    @Override
    public String toString() {
        return "Job: Oil Change";
    }
}
