package com.joysistvi.stage1.day15;

public class UserAccount {

    // private fields (encapsulation)
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Constructor to set all fields at once
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        setEmail(email);
        setPassword(password);
    }

    // Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Warning: Invalid email format. Email not set.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Warning: Password does not meet requirements. Password not set.");
        }
    }

    // Full name helper
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Validation rule: must contain "@" and "." with text before/after both
    private boolean isValidEmail(String email) {
        return email != null
                && email.contains("@")
                && email.contains(".")
                && email.indexOf("@") > 0
                && email.indexOf("@") < email.lastIndexOf(".");
    }

    // Validation rule: at least 8 characters, contains at least one digit
    private boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
    }
}