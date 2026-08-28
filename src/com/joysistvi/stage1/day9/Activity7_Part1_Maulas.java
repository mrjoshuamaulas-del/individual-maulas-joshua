package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_Part1_Maulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}