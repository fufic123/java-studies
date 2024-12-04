package Task1;

class Sailor extends Human {
    private String rank;

    public Sailor(String name, int age, int children, String rank) {
        super(name, age, children);
        this.rank = rank;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rank: " + rank);
    }
}