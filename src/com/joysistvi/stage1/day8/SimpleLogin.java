package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;
        while (!isLoggedIn) {

            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login successful! Welcome, " + email);

                isLoggedIn = true;
            } else {
                System.out.println("Login failed. Incorrect email or password.");
            }
        }
    }
}