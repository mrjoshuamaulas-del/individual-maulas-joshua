package com.joysistvi.stage2.activity.day21;

public class ContractualEmployee extends Employee implements Auditable {
    private double hoursWorked;
    private double hourlyRate;
    private static final double TAX_RATE = 0.05;

    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0); // baseSalary unused for this type
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }

    @Override
    public String generateEmployeeId() {
        return "CON-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId + " salary computed.");
    }
}
