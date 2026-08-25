import java.util.Scanner;

public class Activity4_If_Maulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Game Menu!");

        while (running) {
            System.out.println("\n--- Game Menu ---");
            System.out.println("1. Start Game");
            System.out.println("2. Load Game");
            System.out.println("3. Settings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("You selected Option 1: Start Game");
                } else if (choice == 2) {
                    System.out.println("You selected Option 2: Load Game");
                } else if (choice == 3) {
                    System.out.println("You selected Option 3: Settings");
                } else if (choice == 4) {
                    System.out.println("You selected Option 4: Exit");
                    System.out.println("Thanks for playing! Goodbye.");
                    running = false;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("That's not a number. Please try again.");
                scanner.next(); // clears the invalid input
            }
        }

        scanner.close();
    }
}