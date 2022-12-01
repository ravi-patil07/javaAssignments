package com.assignment.java8;

import java.util.stream.IntStream;

public class Palindrome {

	public static boolean ispalindrome(String input) {

		String tempString = input.replaceAll("\\s+", "");

		return IntStream.range(0, tempString.length() / 2)
				.noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

	}

	public static void main(String[] args) {

		Palindrome p = new Palindrome();

		System.out.println("String is palindrome =>" + ispalindrome("radar"));
	}
}
