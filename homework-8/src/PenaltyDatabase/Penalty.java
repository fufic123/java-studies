package PenaltyDatabase;

public class Penalty {
    String type;
    String city;
    double amount;

    public Penalty(String type, String city, double amount) {
        this.type = type;
        this.city = city;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Penalty{" + "type='" + type + "', city='" + city + "', amount=" + amount + '}';
    }
}
