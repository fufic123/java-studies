import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Task 1: Human, Article, Magazine
        Human author = new Human("John", "Doe", "1990-01-01");
        Article article1 = new Article(author, "AI and the Future", 4.5);
        Article article2 = new Article(author, "Machine Learning Basics", 4.0);
        Article[] articles = {article1, article2};
        Magazine magazine = new Magazine("Tech Insights", Frequency.Monthly, new Date(), 5000, articles);
        magazine.displayInfo();

        // Task 2: Triangle and IsoscelesTriangle
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        IsoscelesTriangle isosceles = new IsoscelesTriangle(5, 6);
        System.out.println("Isosceles Triangle Area: " + isosceles.calculateArea());

        // Task 3: Abstract Figure
        Figure[] figures = {
                new Rectangle(5, 10),
                new Circle(7),
                new RightTriangle(3, 4),
                new Trapezoid(5, 7, 3)
        };
        for (Figure figure : figures) {
            System.out.println("Figure Area: " + figure.calculateArea());
        }

        // Task 4: Musical Instruments
        IInfo[] instruments = {
                new Violin(),
                new Trombone(),
                new Ukulele(),
                new Cello()
        };
        for (IInfo instrument : instruments) {
            instrument.show();
            instrument.sound();
            instrument.desc();
            instrument.history();
            System.out.println();
        }
    }
}
