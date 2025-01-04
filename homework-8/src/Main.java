import BoatPierSimulation.BoatPierSimulation;
import DictionaryApp.DictionaryApp;
import PenaltyDatabase.PenaltyApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHomework Tasks Menu:");
            System.out.println("1. Boat Pier Simulation");
            System.out.println("2. Dictionary Application");
            System.out.println("3. Penalty Database");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Running Boat Pier Simulation...");
                    BoatPierSimulation.main(args);
                    break;

                case 2:
                    System.out.println("Running Dictionary Application...");
                    DictionaryApp.main(args);
                    break;

                case 3:
                    System.out.println("Running Penalty Database...");
                    PenaltyApp.main(args);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
