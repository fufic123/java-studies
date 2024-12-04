package Task3;

class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name, "Herbivore");
    }

    @Override
    public String makeSound() {
        return "Thump!";
    }
}