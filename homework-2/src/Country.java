import java.util.ArrayList;
import java.util.List;

class Country {
    private String name;
    private String continent;
    private long population;
    private String phoneCode;
    private String capital;
    private List<String> cities;

    public Country() {
        this.cities = new ArrayList<>();
    }

    public Country(String name, String continent, long population, String phoneCode, String capital, List<String> cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void setData(String name, String continent, long population, String phoneCode, String capital, List<String> cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void displayData() {
        System.out.println("Country Name: " + name);
        System.out.println("Continent: " + continent);
        System.out.println("Population: " + population);
        System.out.println("Phone Code: " + phoneCode);
        System.out.println("Capital: " + capital);
        System.out.println("Cities: " + cities);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
