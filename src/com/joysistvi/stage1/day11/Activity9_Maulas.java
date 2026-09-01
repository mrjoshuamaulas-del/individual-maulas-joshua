package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Maulas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("           Average Calculator");
        System.out.println("========================================");

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = new String[numSubjects];

        System.out.println();
        System.out.println("Enter subject names:");

        for (int j = 0; j < numSubjects; j++) {
            System.out.print("Subject " + (j + 1) + ": ");
            subjects[j] = scanner.nextLine();
        }

        String[] studentNames = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {

            System.out.println();
            System.out.print("Name of Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");

            double total = 0;

            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextDouble();
                total += grades[i][j];
            }
            scanner.nextLine();

            averages[i] = total / numSubjects;
        }

        System.out.println();
        System.out.println();
        System.out.println("========================================");
        System.out.println("           Grades Report");
        System.out.println("========================================");

        System.out.printf("%-15s", "Student");

        for (int j = 0; j < numSubjects; j++) {
            System.out.printf("%-11s", subjects[j]);
        }

        System.out.printf("%-10s%n", "Average");

        // Divider line width adjusted to fit 5 subjects:
        // 15 (Student) + 11 x numSubjects + 10 (Average) = total width
        int dividerWidth = 15 + (11 * numSubjects) + 10;
        StringBuilder divider = new StringBuilder();
        for (int d = 0; d < dividerWidth; d++) {
            divider.append("-");
        }
        System.out.println(divider);

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-11.0f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }

        scanner.close();
    }
}