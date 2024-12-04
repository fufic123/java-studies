package Task2;

import java.util.HashMap;


public class Task2 {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", 45);
        Course physics = new Course("Physics", 70);
        Course programming = new Course("Programming", 85);
        Course history = new Course("History", 30);

        Course biology = new Course("Biology", 95);
        Course chemistry = new Course("Chemistry", 80);
        Course economics = new Course("Economics", 40);

        Student student1 = new Student("Alice", new Course[]{math, physics, programming});
        Student student2 = new Student("Bob", new Course[]{biology, chemistry});
        Student student3 = new Student("Charlie", new Course[]{history, physics, economics});

        Group group = new Group(new Student[]{student1, student2, student3});

        group.printFailedStudents();
        group.printSuccessfulStudents();

        System.out.println("\nAverage Grades:");
        for (Student student : group.students) {
            System.out.println(student.getName() + "'s Average Grade: " + student.calculateAverage());
        }

        System.out.println("\nCourses with most failures:");
        printMostFailedCourses(new Student[]{student1, student2, student3});

        System.out.println("\nCourses for Bob:");
        for (Course course : student2.getCourses()) {
            System.out.println(" - " + course.getName());
        }
    }

    public static void printMostFailedCourses(Student[] students) {
        HashMap<String, Integer> failureCounts = new HashMap<>();

        for (Student student : students) {
            for (Course course : student.getCourses()) {
                if (!course.isPassed()) {
                    failureCounts.put(course.getName(), failureCounts.getOrDefault(course.getName(), 0) + 1);
                }
            }
        }

        int maxFailures = failureCounts.values().stream().max(Integer::compare).orElse(0);

        for (String courseName : failureCounts.keySet()) {
            if (failureCounts.get(courseName) == maxFailures) {
                System.out.println(" - " + courseName + " (" + maxFailures + " failures)");
            }
        }
    }
}
