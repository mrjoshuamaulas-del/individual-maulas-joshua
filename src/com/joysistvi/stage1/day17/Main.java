package com.joysistvi.stage1.day17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        Create Your Account");
        System.out.println("========================================");
        System.out.println();

        System.out.print("First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Middle Name: ");
        String middleName = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Home Address: ");
        String address = sc.nextLine();

        System.out.print("Email Address: ");
        String email = sc.nextLine();

        System.out.print("Password (min 8 characters, at least 1 number): ");
        String password = sc.nextLine();

        UserAccount account = new UserAccount(firstName, middleName, lastName, address, email, password);

        System.out.println();
        System.out.println("========================================");
        System.out.println("        Account Summary");
        System.out.println("========================================");
        System.out.println("Name    : " + account.getFullName());
        System.out.println("Address : " + account.getAddress());
        System.out.println("Email   : " + account.getEmail());

        sc.close();
    }
}