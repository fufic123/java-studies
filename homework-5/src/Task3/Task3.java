package Task3;

public class Task3 {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Tiger("Tiger1"),
                new Rabbit("Rabbit1"),
                new Wolf("Wolf1"),
                new Kangaroo("Kangaroo1")
        };

        int carnivores = 0;
        int herbivores = 0;

        for (Animal animal : zoo) {
            animal.displayInfo();
            System.out.println("Sound: " + animal.makeSound());

            if (animal.getType().equals("Carnivore")) {
                carnivores++;
            } else if (animal.getType().equals("Herbivore")) {
                herbivores++;
            }
        }

        System.out.println("Total Carnivores: " + carnivores);
        System.out.println("Total Herbivores: " + herbivores);
    }
}