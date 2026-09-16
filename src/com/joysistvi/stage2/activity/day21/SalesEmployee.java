package com.joysistvi.stage2.activity.day21;

public class SalesEmployee extends Employee implements Bonusable {
    private double commission;
    private static final double TAX_RATE = 0.12;

    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }

    @Override
    public double computeBonus() {
        return commission * 0.10;
    }

    @Override
    public boolean isEligibleForBonus() {
        return commission > 0;
    }
}
