class Triangle {
    protected double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSides(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double sideA, double sideB) {
        super(sideA, sideB, sideA);
    }

    @Override
    public double calculateArea() {
        double base = sideB;
        double height = Math.sqrt(sideA * sideA - (base / 2) * (base / 2));
        return (base * height) / 2;
    }
}
