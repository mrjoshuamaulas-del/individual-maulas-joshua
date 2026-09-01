package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class MultiDimentionalArray {

    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // [Section] Nested For Loop -> traversing a multi-dimensional array
        //     for (int i = 0; i < numbers.length; i++) { // outer loop (i -> rows)
        //         for (int j = 0; j < numbers[i].length; j++) { // inner loop (j -> column)
        //             System.out.println(numbers[i][j]);
        //         }
        //         System.out.println(); // newline

//        // [Section] Enhanced Nested For Loop / For Each Loop
//        for (int[] rows : numbers) {
//            for (int column : rows) {
//                System.out.println(column);
//            }
//            System.out.println();
//        }

        // [Section] Syntax Multi-dimentional array with a specified size only
        // datatype[][] arrayObject = new datatype[rows][columns];
        // outer and inner planets
//        String[][] planets = new String[2][4];
//        planets[0][0] = "Mercury";
//        planets[0][1] = "Venus";
//        planets[0][2] = "Earth";
//        planets[0][3] = "Mars";
//
//        planets[1][0] = "Jupiter";
//        planets[1][1] = "Saturn";
//        planets[1][2] = "Uranus";
//        planets[1][3] = "Neptune";

        // [Section] Multi-dimentional array using Scanner
        Scanner scanner = new Scanner(System.in);

        String[][] planets = new String[2][4];

        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.print("Enter Planet[" + i + "][" + j + "]: ");
                planets[i][j] = scanner.nextLine();
            }
        }

        // [Section] Enhanced Nested For Loop / For Each Loop
        for (String[] rows : planets) {
            for (String column : rows) {
                System.out.println(column);
            }
            System.out.println();
        }



    }
}