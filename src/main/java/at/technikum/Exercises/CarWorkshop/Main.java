package at.technikum.Exercises.CarWorkshop;

public class Main {

    public static void main(String[] args) {
        Workshop w = new Workshop();
        w.addWorker(new SeniorWorker("Tom"));
//        w.addWorker(new SeniorWorker("Chris"));
        w.addWorker(new JuniorWorker("Klaus"));
        w.addWorker(new JuniorWorker("Tina"));

        w.setContract(new CarInspection(new Audi(1999)));

        w.printReport();

        w.setContract(new CarInspection(new Opel(2001)));

        w.printReport();

        w.setContract(new OilChange(new Audi(2014)));

        w.printReport();

    }

    /*
    Workshop Report
    Job: Car Inspection
    Number of workers required: 2
    Number of actual workers: 2

    Hours needed: 5

    Price:
    - Senior (Tom) 5 x 50
    - Junior (Tina) 5 x 20
    - Inspection (new car) 150
    ---------
    -> 500

    Status: possible
     */
}