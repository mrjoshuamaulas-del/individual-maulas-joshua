package com.joysistvi.stage1.day12;

public class MathClassExample_Maulas {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("         JAVA MATH CLASS METHODS");
        System.out.println("========================================");

        // Math.abs() - absolute value
        int negativeNum = -15;
        System.out.println();
        System.out.println("Math.abs(-15) = " + Math.abs(negativeNum));
        // Output: 15

        // Math.max() - maximum of two values
        System.out.println("Math.max(10, 25) = " + Math.max(10, 25));
        // Output: 25

        // Math.min() - minimum of two values
        System.out.println("Math.min(10, 25) = " + Math.min(10, 25));
        // Output: 10

        // Math.pow() - power (exponentiation)
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
        // Output: 8.0

        // Math.sqrt() - square root
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25));
        // Output: 5.0

        // Math.round() - round to nearest integer
        System.out.println("Math.round(4.6) = " + Math.round(4.6));
        System.out.println("Math.round(4.4) = " + Math.round(4.4));
        // Output: 5, then 4

        // Math.ceil() - round up (ceiling)
        System.out.println("Math.ceil(4.1) = " + Math.ceil(4.1));
        // Output: 5.0

        // Math.floor() - round down (floor)
        System.out.println("Math.floor(4.9) = " + Math.floor(4.9));
        // Output: 4.0

        // Math.random() - random number between 0.0 and 1.0
        double randomValue = Math.random();
        System.out.println("Math.random() = " + randomValue);
        // Output: a different random decimal every run, e.g., 0.7284193...

        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("Random dice roll (1-6) = " + diceRoll);
        // Output: a random number from 1 to 6

        // Math.log() - natural logarithm (base e)
        System.out.println("Math.log(Math.E) = " + Math.log(Math.E));
        // Output: 1.0

        // Math.log10() - logarithm base 10
        System.out.println("Math.log10(1000) = " + Math.log10(1000));
        // Output: 3.0

        // Math.exp() - exponential function (e^x)
        System.out.println("Math.exp(1) = " + Math.exp(1));
        // Output: 2.718281828459045

        // Math.sin() - sine of an angle (in radians)
        System.out.println("Math.sin(Math.PI / 2) = " + Math.sin(Math.PI / 2));
        // Output: 1.0

        // Math.cos() - cosine of an angle (in radians)
        System.out.println("Math.cos(0) = " + Math.cos(0));
        // Output: 1.0

        // Math.tan() - tangent of an angle (in radians)
        System.out.println("Math.tan(0) = " + Math.tan(0));
        // Output: 0.0

        System.out.println();
        System.out.println("========================================");
        System.out.println("         END OF DEMONSTRATION");
        System.out.println("========================================");
    }
}