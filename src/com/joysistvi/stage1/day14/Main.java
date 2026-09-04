package com.joysistvi.stage1.day14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoadAccount account = new LoadAccount(100.0);

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = sc.nextLine();

        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code. Goodbye!");
            sc.close();
            return;
        }

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("** Globe Services **");
            System.out.println("\t[1] My Account");
            System.out.println("\t[2] Go+");
            System.out.println("\t[3] Unlimited Text & Calls and Data");
            System.out.println("\t[4] Rewards");
            System.out.println("\t[5] Loans");
            System.out.println("\t[6] Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("Your current load balance: P" + account.getBalance());
                    break;
                case 2:
                    String[] goPlusLabels = {"Go+ 99", "Go+109", "Go+199"};
                    double[] goPlusPrices = {99, 109, 199};
                    int[] goPlusDays = {3, 5, 7};
                    showPromoMenu(sc, account, "Go+", goPlusLabels, goPlusPrices, goPlusDays);
                    break;
                case 3:
                    String[] surfLabels = {
                            "Surf4All 99 with unlimited calls and text to all for 5 days",
                            "Surf4All 249 with unlimited calls and text to all for 15 days",
                            "Surf4All 499 with unlimited calls and text to all for 30 days"
                    };
                    double[] surfPrices = {99, 249, 499};
                    int[] surfDays = {5, 15, 30};
                    showPromoMenu(sc, account, "Unlimited Text & Calls and Data", surfLabels, surfPrices, surfDays);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("No rewards available at this time.");
                    break;
                case 5:
                    System.out.println();
                    System.out.println("No loan offers available at this time.");
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using Globe Services. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }

    private static void showPromoMenu(Scanner sc, LoadAccount account, String serviceName, String[] labels, double[] prices, int[] days) {
        boolean inPromoMenu = true;

        while (inPromoMenu) {
            System.out.println();
            System.out.println("** Enjoy " + serviceName + " **");
            for (int i = 0; i < labels.length; i++) {
                System.out.println("\t[" + (i + 1) + "] " + labels[i]);
            }
            System.out.println("\t[" + (labels.length + 1) + "] Back");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice >= 1 && choice <= labels.length) {
                confirmSubscription(sc, account, labels[choice - 1], prices[choice - 1], days[choice - 1]);
                inPromoMenu = false;
            } else if (choice == labels.length + 1) {
                inPromoMenu = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void confirmSubscription(Scanner sc, LoadAccount account, String label, double price, int days) {
        boolean inConfirmMenu = true;

        while (inConfirmMenu) {
            System.out.println();
            System.out.println("-> " + label + " for only P" + (int) price);
            System.out.println("\t[1] Subscribe");
            System.out.println("\t[2] Back");
            System.out.println("\t[3] Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    if (account.deduct(price)) {
                        System.out.println();
                        System.out.println("You have successfully registered to " + label + ".");
                        System.out.println("Promo duration: " + days + " day/s.");
                        System.out.println("Remaining load balance: P" + account.getBalance());
                        System.out.println("Thank you for using our service!");
                        System.out.println();
                        System.out.print("Press Enter to continue...");
                        sc.nextLine();
                    } else {
                        System.out.println("Insufficient balance. Please check your balance and try again.");
                    }
                    inConfirmMenu = false;
                    break;
                case 2:
                    inConfirmMenu = false;
                    break;
                case 3:
                    System.out.println("Thank you for using Globe Services. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}