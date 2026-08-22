package com.joysistvi.stage1.day4;

public class Activity2_Maulas {

    public static void main(String[] args) {
        System.out.println("\nSee My Expense Tracker Program Below");
        System.out.println();

        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Calculate percentage of each expense relative to total income
        double foodPercent = (foodAllowance / income) * 100;
        double transportationPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        // Calculate remaining balance after all expenses
        double remainingBalance = income - (foodAllowance + transportation + rent + utilityBill);

        // Display results
        System.out.printf("\tIncome: %.0f%n", income);
        System.out.printf("\tFood Allowance: %.1f %%%n", foodPercent);
        System.out.printf("\tTransportation: %.1f %%%n", transportationPercent);
        System.out.printf("\tRent: %.1f %%%n", rentPercent);
        System.out.printf("\tUtility Bill: %.1f %%%n", utilityPercent);
        System.out.printf("\tRemaining Balance: %.0f%n", remainingBalance);




    }
}
