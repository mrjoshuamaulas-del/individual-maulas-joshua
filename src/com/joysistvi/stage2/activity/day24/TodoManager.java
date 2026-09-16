import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Todo Manager Menu ---");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Enter task to add: ");
                String newTask = scanner.nextLine();
                tasks.add(newTask);
                System.out.println("Task added.");

            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                } else {
                    System.out.println("Your tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ". " + tasks.get(i));
                    }
                }

            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to update.");
                } else {
                    System.out.print("Enter index of task to update: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index < tasks.size()) {
                        System.out.print("Enter new task text: ");
                        String updatedTask = scanner.nextLine();
                        tasks.set(index, updatedTask);
                        System.out.println("Task updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                }

            } else if (choice == 4) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to remove.");
                } else {
                    System.out.print("Enter index or name of task to remove: ");
                    String input = scanner.nextLine();
                    if (isNumeric(input)) {
                        int index = Integer.parseInt(input);
                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index);
                            System.out.println("Task removed.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        boolean removed = tasks.remove(input);
                        if (removed) {
                            System.out.println("Task removed.");
                        } else {
                            System.out.println("Task not found.");
                        }
                    }
                }

            } else if (choice == 5) {
                tasks.clear();
                System.out.println("All tasks cleared.");

            } else if (choice == 0) {
                System.out.println("Exiting TodoManager. Goodbye!");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
