package com.assignment.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeStringArray {

	
	public static void main(String[] args) {
	 
		String [] arr = {"abc", "radar", "rasfsdfr", "dad","rar"};
	
		List<String> strList= new ArrayList<String>(Arrays.asList(arr));
		
		for(int i=0; i< strList.size(); i++){
			
			String revString= "";
			String oriString= strList.get(i);
			for(int j= oriString.length()-1; j>=0; j-- ) {
				
			  revString= revString + oriString.charAt(j);
			
			}
			if(!revString.equalsIgnoreCase(oriString)) {
     
				strList.remove(oriString);
			}
			
		}
		strList.forEach(System.out::println);
		
		}
}
