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
        System.out.println("\tIncome: " + income);
        System.out.println("\tFood Allowance: " + foodPercent + " %");
        System.out.println("\tTransportation: " + transportationPercent + " %");
        System.out.println("\tRent: " + rentPercent + " %");
        System.out.println("\tUtility Bill: " + utilityPercent + " %");
        System.out.println("\tRemaining Balance: " + remainingBalance);




    }
}
