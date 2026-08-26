package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Maulas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 5000.00;
        boolean running = true;

        System.out.println("Welcome to Simple ATM!");

        while (running) {
            System.out.println("\n=== SIMPLE ATM MENU ===");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");
            System.out.print("Enter choice (1-4): ");

            if (!input.hasNextInt()) {
                System.out.println("That's not a valid number. Please try again.");
                input.next(); // clears the bad input
                continue;
            }

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    if (!input.hasNextDouble()) {
                        System.out.println("Invalid amount entered.");
                        input.next();
                        break;
                    }
                    double depositAmount = input.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful. New balance: " + balance);
                    } else {
                        System.out.println("Invalid amount. Deposit must be greater than zero.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    if (!input.hasNextDouble()) {
                        System.out.println("Invalid amount entered.");
                        input.next();
                        break;
                    }
                    double withdrawAmount = input.nextDouble();

                    if (withdrawAmount > 0) {
                        if (withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful. New balance: " + balance);
                        } else {
                            System.out.println("Insufficient balance. Your current balance is: " + balance);
                        }
                    } else {
                        System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Simple ATM. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }

        input.close();
    }
}