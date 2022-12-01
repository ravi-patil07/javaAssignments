package com.assignment.java8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenOddArmPalindromeNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	//	int s=sc.nextInt();
		System.out.println("Enter the first Number");
		
		int number1 = sc.nextInt();

		System.out.println("Enter the second Number");

		int number2 = sc.nextInt();

		System.out.println("Enter the Third Number");

		int number3 = sc.nextInt();

		System.out.println("Enter the Fourth Number");

		int number4 = sc.nextInt();
		
		boolean num1= number1 % 2 == 0;
		
		if(num1 == true) {
			System.out.println("The given number is Even");
		}else {
			System.out.println("The given number is Odd");
		}
		
		boolean num2 = number2 % 2 !=0;
		
		if(num2 == true) {
			System.out.println("The given number is Odd");
		}else {
			System.out.println("The given number is Even");
		}
		
		int remainder = 0;
		int rev = 0;

		int reduce = IntStream.iterate(number3, i -> i / 10).map(n -> n % 10).limit(String.valueOf(number3).length())
				.reduce(0, (a, b) -> a = a + (b * b * b));

		if (reduce == number3) {
			System.out.println("The number is ArmStrong");

		} else {

			System.out.println("The number is Not-ArmStrong");

		}

		int reverse = IntStream.iterate(number4, i -> i / 10).map(n -> n % 10).limit(String.valueOf(number4).length())
				.reduce(0, (a, b) -> a = a * 10 + b);

		if (reverse == number4) {
			System.out.println("The number is Palindrome");

		} else {

			System.out.println("The number is Not-Palindrome");

		}
	}
}
