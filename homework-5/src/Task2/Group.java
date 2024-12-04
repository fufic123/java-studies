package Task2;

class Group {
    public Student[] students;

    public Group(Student[] students) {
        this.students = students;
    }

    public void printFailedStudents() {
        System.out.println("Failed Students:");
        for (Student student : students) {
            if (student.hasDebts()) {
                System.out.println(" - " + student.getName());
            }
        }
    }

    public void printSuccessfulStudents() {
        System.out.println("Successful Students:");
        for (Student student : students) {
            if (!student.hasDebts()) {
                System.out.println(" - " + student.getName());
            }
        }
    }
}