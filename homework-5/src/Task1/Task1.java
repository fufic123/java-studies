package Task1;

public class Task1 {
    public static void main(String[] args) {
        Builder builder = new Builder("John", 40, 2, "Structural Engineer");
        Sailor sailor = new Sailor("Mike", 35, 3, "Captain");
        Pilot pilot = new Pilot("Anna", 30, 1, 1500);

        Human[] friends = {builder, sailor, pilot};

        int totalChildren = 0;
        for (Human friend : friends) {
            friend.displayInfo();
            totalChildren += friend.getChildren();
        }

        System.out.println("Total number of children: " + totalChildren);
    }
}