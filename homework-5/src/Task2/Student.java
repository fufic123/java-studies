package Task2;

class Student {
    private String name;
    private Course[] courses;

    public Student(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public boolean hasDebts() {
        for (Course course : courses) {
            if (!course.isPassed()) {
                return true;
            }
        }
        return false;
    }

    public double calculateAverage() {
        int total = 0, count = 0;
        for (Course course : courses) {
            if (course.isPassed()) {
                total += course.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : (double) total / count;
    }
}