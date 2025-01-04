package UserManagementSystem;

import java.util.HashMap;
import java.util.Scanner;

public class UserManagementSystem {
    private HashMap<String, String> users;

    public UserManagementSystem() {
        users = new HashMap<>();
    }

    public void addUser(String login, String password) {
        users.put(login, password);
    }

    public boolean removeUser(String login) {
        return users.remove(login) != null;
    }

    public boolean userExists(String login) {
        return users.containsKey(login);
    }

    public boolean updateLogin(String currentLogin, String newLogin) {
        if (users.containsKey(currentLogin)) {
            String password = users.remove(currentLogin);
            users.put(newLogin, password);
            return true;
        }
        return false;
    }

    public boolean updatePassword(String login, String newPassword) {
        if (users.containsKey(login)) {
            users.put(login, newPassword);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManagementSystem ums = new UserManagementSystem();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Check User Exists");
            System.out.println("4. Update Login");
            System.out.println("5. Update Password");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter login: ");
                    String login = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    ums.addUser(login, password);
                    System.out.println("User added successfully!");
                    break;

                case 2:
                    System.out.print("Enter login to remove: ");
                    login = scanner.nextLine();
                    if (ums.removeUser(login)) {
                        System.out.println("User removed successfully!");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter login to check: ");
                    login = scanner.nextLine();
                    if (ums.userExists(login)) {
                        System.out.println("User exists.");
                    } else {
                        System.out.println("User does not exist.");
                    }
                    break;

                case 4:
                    System.out.print("Enter current login: ");
                    String currentLogin = scanner.nextLine();
                    System.out.print("Enter new login: ");
                    String newLogin = scanner.nextLine();
                    if (ums.updateLogin(currentLogin, newLogin)) {
                        System.out.println("Login updated successfully!");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter login: ");
                    login = scanner.nextLine();
                    System.out.print("Enter new password: ");
                    password = scanner.nextLine();
                    if (ums.updatePassword(login, password)) {
                        System.out.println("Password updated successfully!");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
