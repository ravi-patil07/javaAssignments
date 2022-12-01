package com.assignment.arrays;

import java.util.Scanner;

//  WAP to find third maximum number from list of numbers.

public class ThirdMaxNum {

	private static int getThirdLargestNum(int[] a, int len) {

		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[len-3];

	}

	public static void main(String[] args) {

		
		int[] a = { 10, 8, 6, 4, 3, 9, 5 };
		int len=a.length;
		System.out.println("Third Largest Number  " + getThirdLargestNum(a, len));

	}
}