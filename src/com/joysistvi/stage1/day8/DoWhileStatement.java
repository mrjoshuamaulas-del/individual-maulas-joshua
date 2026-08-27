package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class DoWhileStatement {

    public static void main(String[] args) {

        // [syntax] Do-While Loop
        /*
            do {
                // statement / body of the loop
               } while (condition);
         */

        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;
        do {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");

                isLoggedIn = true; // stop the while loop
            } else {
                System.out.println("Invalid Username or Password!");
            }
        } while (!isLoggedIn);
        }


    }

