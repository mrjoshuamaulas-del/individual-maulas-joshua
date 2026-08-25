package com.joysistvi.stage1.day6;
import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month: ");

        String month = "July";

        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("First Quarter of the year.");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("Second Quarter of the year.");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println("Third Quarter of the year.");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println("Fourth Quarter of the year.");
                break;
            default:
                System.out.println("Invalid Input! Please input a valid month");

        }



        /*
            Pwede: String, Byte, Short, Int, Enum
            Bawal: Boolean (Range), Long, Float, Double
         */


    }
}
