package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P41 {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers in the range from 1 to 40:");

    int[] array = {5, 10, 15, 20, 25}; 

    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    if (isValidInput(num1) && isValidInput(num2)) {
        if (isBingo(num1, num2, array)) {
            System.out.println("Bingo!");
         
        } else {
            System.out.println("Not found in the array.");
        }
    } else {
        System.out.println("Numbers should be in the range from 1 to 40.");
    }

    scanner.close();
}

// Function to check if a number is in the valid range
public static boolean isValidInput(int num) {
    return num >= 1 && num <= 40;
}

// Function to check if both numbers are found in the array
public static boolean isBingo(int num1, int num2, int[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == num1 || array[i] == num2) {
            // Found one of the numbers
            boolean foundBoth = false;
            for (int j = i + 1; j < array.length; j++) {
                if ((array[j] == num1 && array[i] == num2) || (array[j] == num2 && array[i] == num1)) {
                    foundBoth = true;
                    break;
                }
            }
            if (foundBoth) {
                return true; // Both numbers found in the array
            }
        }
    }
    return false; // Both numbers not found in the array
}


}
