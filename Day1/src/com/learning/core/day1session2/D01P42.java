package com.learning.core.day1session2;

public class D01P42 {
    int[] intA = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

    int sum = 0;{
    for (int p = 0; p <= 14; p++) {
        sum += intA[p];
    }
    intA[15] = sum;

    // Compute the average of all numbers and store it at element 16
    double average = (double) sum / 15;
    intA[16] = (int) Math.round(average);

    // Identify the smallest value from the array and store it at element 17
    int smallest = intA[0];
    for (int q = 1; q < intA.length; q++) {
        if (intA[q] < smallest) {
            smallest = intA[q];
        }
    }
    intA[17] = smallest;

    // Print the array after computations
    System.out.println("Array after computations:");
    for (int i = 0; i < intA.length; i++) {
        System.out.print(intA[i] + " ");
    }
}
}

