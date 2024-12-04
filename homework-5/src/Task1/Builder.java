package Task1;

class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, int children, String specialization) {
        super(name, age, children);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}