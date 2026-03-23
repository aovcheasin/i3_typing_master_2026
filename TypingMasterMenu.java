import java.util.Scanner;

public class TypingMasterMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        // Display menu
        System.out.println("------------ Welcome to I3 Typing Master v2026 -----------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println("  1. Login");
        System.out.println("  2. Register");
        System.out.println("  3. Exit");
        System.out.print("Choose an option: - ");

        // Get user input
        choice = input.nextInt();

        // Process choice
        switch (choice) {
            case 1:
                System.out.println("You selected: Login");
                break;
            case 2:
                System.out.println("You selected: Register");
                break;
            case 3:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }

        input.close();
    }
}