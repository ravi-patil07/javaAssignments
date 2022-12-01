package com.assignment.java8;
public class Pattern 
{ 
	 
	public static void main(String[] args) {

		int rows = 5;

		for (int i = rows; i >= 1; i--) {  //Outer loop for rows

		for (int j = 1; j <= i; j++) { //Inner loop for Col

		System.out.print("* "); //Print *

		}

		System.out.println(); //New line

		}

		}
}