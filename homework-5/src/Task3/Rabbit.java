package Task3;

class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name, "Herbivore");
    }

    @Override
    public String makeSound() {
        return "Squeak!";
    }
}