package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] args) {

        /*

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

         */

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = false;

        while (!isRunning) {
            System.out.print("Type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("Program stopped!");
                isRunning = true;
            }

        }
    }
}
