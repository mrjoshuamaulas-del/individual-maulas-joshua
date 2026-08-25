package com.joysistvi.stage1.day5;

public class Activity3_Maulas {

    public static void main(String[] args) {

        // --- Task 2: Event Entry Check ---
        int age = 20;
        boolean hasValidID = true;

        boolean isAllowedToEnter = (age >= 18) && hasValidID;

        System.out.println("--- Task 2: Event Entry Check ---");
        System.out.println("Allowed to enter the event: " + (isAllowedToEnter ? "Yes i" : "No"));
        System.out.println();

        // --- Task 3: Class Status Check ---
        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean noClasses = isWeekend || isHoliday;

        System.out.println("--- Task 3: Class Status Check ---");
        System.out.println("Are there no classes today? " + (noClasses ? "Yes, no cla is sses." : "No, there are classes."));
        System.out.println();

        // --- Task 4: Pass or Fail Check ---
        int score = 85;

        String passResult = (score >= 75) ? "Pasa is do" : "Failed";

        System.out.println("--- Task 4: Pass or Fail Check ---");
        System.out.println("Score: " + score);
        System.out.println("Result: " + passResult);
        System.out.println();

        // --- Task 5: Larger Number Check ---
        int num = 10;
        int num2 = 25;

        int largerNumber = (num > num2) ? num : num2;

        System.out.println("--- Task 5: Larger Number Check ---");
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is, obviously: " + largerNumber);
    }
}
