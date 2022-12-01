package com.assignment.strings;

import java.util.Scanner;

//2.	WAP to print the all alphabets of string in ascending and descending order.

public class AscendingDescendingAplhabets {

	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter a String ");
	 
	 String sc= scanner.nextLine();
	 
	 int len =sc.length();
	
	 char [] c =sc.toCharArray();	
	 
	 char temp;
	 for(int i=0; i< len; i++) {
		 
		 for(int j= i+1; j<len; j++ ) {
			 	 
			 if(c[i] > c[j]) {
				 
				 temp=c[i];
				 c[i]=c[j];
			     c[j]= temp;
				 
			 }
			
		 }
		
	 }
	  
	 System.out.print("Alphabets in Ascending order ==> ");
	 for(char str:c)
		System.out.print(" "+str);
	 
	  for(int i=0 ; i<len; i++) {
		  
		  for(int j=i+1; j<len; j++) {
			  
			  if(c[i]  < c[j] ) {
				  
				  temp=c[j];
				  c[j]=c[i];
				  c[i]=temp;
			  }
		  }
	  }
	  
	  System.out.print("\n Alphabets in Descending order ==> ");
	  for(char str: c) {
		  System.out.print(" "+str);
	  }
	}
}
