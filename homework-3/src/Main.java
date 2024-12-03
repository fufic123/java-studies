public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Name Surname", "2000-01-01", "+123456789", "City", "Country", "123 Street");
        human1.displayData();
        Human human2 = new Human();
        human2.setData("Name Surname", "1995-05-05", "+987654321", "Another City", "Another Country", "456 Avenue");
        human2.displayData();
        System.out.println("Number of Human objects created: " + Human.getCount());
        System.out.println();

        City city = new City("Kyiv", "Kyiv Region", "Ukraine", 2800000, "01001", "+38044");
        city.displayData();
        city.setPopulation(3000000);
        System.out.println("Updated Population: " + city.getPopulation());
        System.out.println();

        System.out.println("Maximum of (10, 20, 30, 40): " + MathOperations.max(10, 20, 30, 40));
        System.out.println("Minimum of (10, 20, 30, 40): " + MathOperations.min(10, 20, 30, 40));
        System.out.println("Mean of (10, 20, 30, 40): " + MathOperations.mean(10, 20, 30, 40));
        System.out.println("Factorial of 5: " + MathOperations.factorial(5));
    }
}
