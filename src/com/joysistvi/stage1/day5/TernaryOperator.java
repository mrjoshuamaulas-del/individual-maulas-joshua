package com.joysistvi.stage1.day5;

public class TernaryOperator {

    public static void main(String[] args) {
        // syntax
        // (condition) ? true block : false block;

        // program that identifies if a number is positive or negative
        int num = 10;

        String numberType = (num > 0) ? "positive" : "Negative";
        System.out.println(numberType + " Number");

        // program that identifies if a number is odd or even
        int num2 = 201;
        String numberCategory = num2 % 2 == 0 ? "Even" : "Odd";
        System.out.println(numberCategory + " Number");










    }
}
