package com.assignment.strings;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ==>");
		Scanner scanner= new Scanner(System.in);
		
		String scan= scanner.nextLine();
		
		
		for(int i=0; i< scan.length(); i++) {
			
			if(scan.charAt(i)=='a' || scan.charAt(i)=='i' || scan.charAt(i)=='o' || 
					scan.charAt(i)=='u' || scan.charAt(i)=='e') {
				continue;
			}else {
				//System.out.print("Removed the vowels in string\n ==>");
				System.out.print(scan.charAt(i));
			}
		}
		
		scanner.close();
	}
}
