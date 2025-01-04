package PenaltyDatabase;

public class PenaltyApp {
    public static void main(String[] args) {
        PenaltyDatabase db = new PenaltyDatabase();

        db.addPenalty("12345", new Penalty("Speeding", "New York", 100.0));
        db.addPenalty("12345", new Penalty("Parking", "Los Angeles", 50.0));
        db.addPenalty("67890", new Penalty("Speeding", "New York", 200.0));

        db.printPenaltiesByCode("12345");
        db.printPenaltiesByType("Speeding");
        db.printPenaltiesByCity("New York");
    }
}
