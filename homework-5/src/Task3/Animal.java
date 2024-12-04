package Task3;

abstract class Animal {
    protected String name;
    protected String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract String makeSound();

    public void displayInfo() {
        System.out.println("Animal: " + name + ", Type: " + type);
    }
}