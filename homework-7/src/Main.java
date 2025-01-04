import ServerRequestQueue.ServerRequestQueue;
import UserManagementSystem.UserManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select application to run:");
        System.out.println("1. User Management System");
        System.out.println("2. Server Request Queue");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                UserManagementSystem.main(args);
                break;

            case 2:
                ServerRequestQueue serverQueue = new ServerRequestQueue();
                int option;
                do {
                    System.out.println("\nServer Request Queue Menu:");
                    System.out.println("1. Add Request");
                    System.out.println("2. Process Next Request");
                    System.out.println("3. View All Requests");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            System.out.print("Enter client name: ");
                            String client = scanner.nextLine();
                            System.out.print("Enter priority (lower number = higher priority): ");
                            int priority = scanner.nextInt();
                            serverQueue.addRequest(client, priority);
                            System.out.println("Request added successfully!");
                            break;

                        case 2:
                            ServerRequestQueue.Request request = serverQueue.processNextRequest();
                            if (request != null) {
                                System.out.println("Processing: " + request);
                            } else {
                                System.out.println("No requests to process.");
                            }
                            break;

                        case 3:
                            serverQueue.viewRequests();
                            break;

                        case 4:
                            System.out.println("Exiting...");
                            break;

                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                } while (option != 4);
                break;

            default:
                System.out.println("Invalid choice. Exiting...");
        }

        scanner.close();
    }
}
