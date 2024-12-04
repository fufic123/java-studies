import java.util.Date;

enum Frequency {
    Weekly,
    Monthly,
    Yearly
}

class Human {
    private String firstName;
    private String lastName;
    private String birthDate;

    public Human(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Article {
    private Human author;
    private String title;
    private double rating;

    public Article(Human author, String title, double rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author.getFullName() + ", Rating: " + rating;
    }
}

class Magazine {
    private String name;
    private Frequency frequency;
    private Date releaseDate;
    private int circulation;
    private Article[] articles;

    public Magazine(String name, Frequency frequency, Date releaseDate, int circulation, Article[] articles) {
        this.name = name;
        this.frequency = frequency;
        this.releaseDate = releaseDate;
        this.circulation = circulation;
        this.articles = articles;
    }

    public void displayInfo() {
        System.out.println("Magazine: " + name);
        System.out.println("Frequency: " + frequency);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Circulation: " + circulation);
        System.out.println("Articles:");
        for (Article article : articles) {
            System.out.println(" - " + article.getDetails());
        }
    }
}
