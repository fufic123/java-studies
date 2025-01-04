package BoatPierSimulation;

public class Boat {
    long arrivalTime;
    int freeSeats;
    boolean isFinalStop;

    public Boat(long arrivalTime, int freeSeats, boolean isFinalStop) {
        this.arrivalTime = arrivalTime;
        this.freeSeats = freeSeats;
        this.isFinalStop = isFinalStop;
    }
}