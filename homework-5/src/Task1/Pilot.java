package Task1;

class Pilot extends Human {
    private int flightHours;

    public Pilot(String name, int age, int children, int flightHours) {
        super(name, age, children);
        this.flightHours = flightHours;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flight Hours: " + flightHours);
    }
}