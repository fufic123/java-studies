class Human {
    private String fullName;
    private String birthDate;
    private String phone;
    private String city;
    private String country;
    private String address;

    private static int count = 0;

    public Human() {
        count++;
    }

    public Human(String fullName, String birthDate, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
        count++;
    }

    public void setData(String fullName, String birthDate, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void displayData() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + birthDate);
        System.out.println("Phone: " + phone);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Address: " + address);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getCount() {
        return count;
    }
}
