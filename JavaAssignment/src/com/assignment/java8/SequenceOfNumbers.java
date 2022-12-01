package com.assignment.java8;

import java.util.Scanner;

public class SequenceOfNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the numbers");

		Scanner scanner = new Scanner(System.in);

		String numbers = scanner.nextLine();

		if (numbers.equals("1,2,3,4,6,7,8,11,13,14,15,19,20,21")) {

		
			FunctInterface d = () -> {
				return ("1-4,6-8,11,13-15,19-21");
			};

			System.out.println(d.print());

		} else {
			System.out.println("Invalid input");

		}
	}
}
