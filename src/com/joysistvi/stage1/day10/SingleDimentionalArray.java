package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class SingleDimentionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Syntax -> Declare an array with a specified size only
        // DataType[] object = new DataType[5];

        int[] evenNumbers = new int[5];

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print("Enter the first five even numbers: ");
            evenNumbers[i] = input.nextInt();

        }

        System.out.print("\nTraversing even numbers: ");
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }






//        evenNumbers[0] = 2;
//        evenNumbers[1] = 4;
//        evenNumbers[2] = 6;
//        evenNumbers[3] = 8;
//        evenNumbers[4] = 10;
//
//        System.out.println(evenNumbers[4]);



        //                  0       1       2       3       4
//        String[] cars = {"Sedan", "SUV", "Jeepney", "EV", "Ford"};

//        System.out.println(cars[4]);
//
//        System.out.println(cars.length);
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);


//        for (String car : cars) {
//            System.out.println(car);
//        }






    }
}
