package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get factorial");
		
		int number = sc.nextInt();
		sc.close();
		int i,fact = 1;
		
		for(i=1;i<=number;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);
		sc.close();
		

	}

}
