package Task3;

class Wolf extends Animal {
    public Wolf(String name) {
        super(name, "Carnivore");
    }

    @Override
    public String makeSound() {
        return "Howl!";
    }
}