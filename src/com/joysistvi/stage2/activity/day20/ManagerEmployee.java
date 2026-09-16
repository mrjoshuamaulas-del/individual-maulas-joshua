package com.joysistvi.stage2.activity.day20;

public class ManagerEmployee extends Employee {

    private static final double ALLOWANCE = 5000;

    public ManagerEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + ALLOWANCE;
    }

    @Override
    public String getEmployeeType() {
        return "Manager";
    }
}
