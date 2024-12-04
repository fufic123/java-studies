package Task1;

class Human {
    protected String name;
    protected int age;
    protected int children;

    public Human(String name, int age, int children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }

    public int getChildren() {
        return children;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Children: " + children);
    }
}