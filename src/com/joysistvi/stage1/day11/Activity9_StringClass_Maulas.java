package com.joysistvi.stage1.day11;

public class Activity9_StringClass_Maulas {

    public static void main(String[] args) {

        String country = "Philippines";

        // Task 1: Display the first and last character
        char firstChar = country.charAt(0);
        char lastChar = country.charAt(country.length() - 1);

        System.out.println("String: " + country);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // Task 2: Count how many times 'P' or 'p' appears
        int pCount = 0;
        char[] letters = country.toCharArray();

        for (char c : letters) {
            if (c == 'P' || c == 'p') {
                pCount++;
            }
        }
        System.out.println("Occurrences of 'P'/'p': " + pCount);

        // Task 3: Count total number of vowels (a, e, i, o, u)
        int vowelCount = 0;
        String lowerCountry = country.toLowerCase();

        for (char c : lowerCountry.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Total vowels: " + vowelCount);
    }
}
