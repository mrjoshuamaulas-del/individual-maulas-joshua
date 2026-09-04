package com.joysistvi.stage1.day13;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        System.out.println(sum(firstNum, secondNum));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}