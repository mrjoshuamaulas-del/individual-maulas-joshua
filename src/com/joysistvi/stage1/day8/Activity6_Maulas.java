package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Maulas {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String email = "winter@gmail.com";
            String password = "winter123";

            int maxAttempt = 3;
            boolean isLoggedIn = false;

            System.out.println("========================================");
            System.out.println("  WELCOME! PLEASE LOG YOUR CREDENTIALS  ");
            System.out.println("========================================");
            System.out.println();

            for (int attempt = 1; attempt <= maxAttempt; attempt++) {

                System.out.println("Attempt " + attempt + " of " + maxAttempt);

                System.out.print("Enter email: ");
                String loginEmail = scanner.nextLine();

                System.out.print("Enter password: ");
                String loginPass = scanner.nextLine();

                if (!loginEmail.equals(email)) {
                    System.out.println("Invalid username");
                } else if (!loginPass.equals(password)) {
                    System.out.println("Invalid password");
                } else {
                    System.out.println("Login successful! Welcome, " + email);
                    isLoggedIn = true;
                    break;
                }
            }

            if (!isLoggedIn) {
                System.out.println("Too many failed attempts. Account locked.");
            }
        }
    }