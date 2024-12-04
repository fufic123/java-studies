package Task2;

class Course {
    private String name;
    private int grade;

    public Course(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isPassed() {
        return grade >= 50;
    }
}