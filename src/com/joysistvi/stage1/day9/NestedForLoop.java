package com.joysistvi.stage1.day9;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



/*
        for (int i = 1; i <= 3; i++) { // outer for loop
            System.out.println(i);

            for (int j = 1; j <= 3; j++) { // inner for loop
                System.out.println("\t" + j);
            }

 */
        }
    }
