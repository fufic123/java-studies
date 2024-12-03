class City {
    // Fields of the class
    private String name;
    private String region;
    private String country;
    private long population;
    private String postalCode;
    private String phoneCode;

    // Default constructor
    public City() {
    }

    // Overloaded constructor
    public City(String name, String region, String country, long population, String postalCode, String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    // Method to input data
    public void setData(String name, String region, String country, long population, String postalCode, String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    // Method to display data
    public void displayData() {
        System.out.println("City Name: " + name);
        System.out.println("Region: " + region);
        System.out.println("Country: " + country);
        System.out.println("Population: " + population);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("Phone Code: " + phoneCode);
    }

    // Getters and setters for individual fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
