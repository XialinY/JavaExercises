package at.technikum.OOPexercises;

import java.time.LocalTime;

public class Airplane {

    private String flightNumber;
    private String destination;
    private LocalTime departure;
    private int delay;

    public Airplane(String flightNumber, LocalTime departure, String destination) {
        this.departure = departure;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }
    public void updatedDeparture(Airplane flight) {
        this.departure = departure.plusMinutes(delay);
        if (delay == 0){
            System.out.printf("The flight %s is ON TIME: %s!", flight.getFlightNumber(), flight.getDeparture());
        }
        else {
            System.out.printf("The updated time for this flight is: %s", departure);
        }
    }
    public void isDelayed(Airplane flight) {
        if (this.delay != 0) {
            System.out.printf("\nThe flight to %s is DELAYED!", flight.getDestination());
        }
        else {
            System.out.printf("\nThe flight to %s is ON TIME!", flight.getDestination());
        }
    }
    public void setDelay(int minutesDelayed) {
        this.delay = minutesDelayed;
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public int getDelay() {
        return delay;
    }
}
