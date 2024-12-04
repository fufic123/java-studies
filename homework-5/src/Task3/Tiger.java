package Task3;

class Tiger extends Animal {
    public Tiger(String name) {
        super(name, "Carnivore");
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
}