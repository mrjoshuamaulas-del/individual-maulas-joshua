package com.joysistvi.stage2.activity.day20;

public class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        return baseSalary;
    }

    public void printPayslip() {
        System.out.println(name + "'s salary: " + computeSalary());
    }
}
