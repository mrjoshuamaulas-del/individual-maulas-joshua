package com.joysistvi.stage1.day13;

public class Main {
    // Create an object - Instantiation
    // ClassName object = new Constructor();

    // Scanner, String, Math

    public static void main(String[] args) {
        //
        Laptop laptop = new Laptop();
        laptop.brand = "HP";
        laptop.color = "Gray";
        laptop.ramInGb = 12;
        laptop.weightInKg = 1.2;
        laptop.cpu = "i5";

        laptop.playGames();
        laptop.sendEmail();
        laptop.writeCodes();
        laptop.watchTutorial();


        Laptop laptop2 = new Laptop();
        laptop2.brand = "Lenovo";
        laptop2.color = "White";
        laptop2.ramInGb = 8;
        laptop2.weightInKg = 1.5;
        laptop2.cpu = "ryzen5";

        laptop2.watchTutorial();
        laptop2.writeCodes();
        laptop2.sendEmail();


        Laptop laptop3 = new Laptop();
        laptop3.brand = "MSI";
        laptop3.color = "Black";
        laptop3.ramInGb = 32;
        laptop3.cpu = "ryzen9";

        laptop3.sendEmail();
        laptop3.playGames();
        laptop3.writeCodes();







    }










}
