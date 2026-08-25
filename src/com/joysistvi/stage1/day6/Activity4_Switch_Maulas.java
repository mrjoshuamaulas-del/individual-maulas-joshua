import java.util.Scanner;

public class Activity4_Switch_Maulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Student Portal!");

        while (running) {
            System.out.println("\n--- Student Portal Menu ---");
            System.out.println("1. View Grades");
            System.out.println("2. Enroll Subjects");
            System.out.println("3. Pay Tuition");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("You selected Option 1: View Grades");
                        break;
                    case 2:
                        System.out.println("You selected Option 2: Enroll Subjects");
                        break;
                    case 3:
                        System.out.println("You selected Option 3: Pay Tuition");
                        break;
                    case 4:
                        System.out.println("You selected Option 4: Exit");
                        System.out.println("Thanks for visiting the portal! Goodbye.");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } else {
                System.out.println("That's not a number. Please try again.");
                scanner.next(); // clears the invalid input
            }
        }

        scanner.close();
    }
}