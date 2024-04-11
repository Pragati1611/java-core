package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P31 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number between 1 to 12 to know the monthName");
		
		int a = sc.nextInt();
		
		String[] monthName = {"January","february","March","April","May","June","July","August","September",
				"October","November","December"};
		
		if(a >= 1 && a <= 12) {
			System.out.println("Month : "+ monthName[a-1]);
		}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();

	}

}
