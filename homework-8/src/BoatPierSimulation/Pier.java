package BoatPierSimulation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Pier {
    Queue<Passenger> passengers = new LinkedList<>();
    Queue<Boat> boats = new LinkedList<>();
    Random random = new Random();

    public void simulatePier(long totalTime, int maxPassengers, int boatInterval) {
        long currentTime = 0;

        while (currentTime < totalTime) {
            if (random.nextInt(2) == 0) {
                passengers.add(new Passenger(currentTime));
            }

            if (currentTime % boatInterval == 0) {
                boats.add(new Boat(currentTime, random.nextInt(50), random.nextBoolean()));
            }

            if (!boats.isEmpty() && !passengers.isEmpty()) {
                Boat boat = boats.poll();
                while (boat.freeSeats > 0 && !passengers.isEmpty()) {
                    passengers.poll();
                    boat.freeSeats--;
                }
            }

            currentTime++;
        }

        System.out.println("Simulation Complete!");
        System.out.println("Remaining passengers at pier: " + passengers.size());
    }
}
