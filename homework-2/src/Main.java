import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Testing the Country class
        Country country = new Country();
        List<String> cities = new ArrayList<>();
        cities.add("City1");
        cities.add("City2");
        cities.add("City3");
        country.setData("CountryName", "ContinentName", 5000000, "+123", "CapitalCity", cities);
        country.displayData();
        country.setName("UpdatedCountryName");
        System.out.println("Updated Country Name: " + country.getName());
        System.out.println();

        // Testing the Book class
        Book book = new Book("BookTitle", "AuthorName", 2023, "PublisherName", "GenreName", 350);
        book.displayData();
        book.setTitle("UpdatedBookTitle");
        book.setYear(2024);
        System.out.println("Updated Title: " + book.getTitle());
        System.out.println("Updated Year: " + book.getYear());
        System.out.println();

        // Testing the Car class
        Car car = new Car("CarName", "ManufacturerName", 2020, 2.5);
        car.displayData();
        car.setEngineVolume(3.0);
        System.out.println("Updated Engine Volume: " + car.getEngineVolume() + "L");
    }
}
