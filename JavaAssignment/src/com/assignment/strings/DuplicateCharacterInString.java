package com.assignment.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		
		 System.out.println("Enter a String ==>");
		 Scanner sc= new Scanner(System.in);
		 String str= sc.nextLine();
		 int count = 0;
		
		//String str= "Greatttt responsibility";
		
		//char[] c = str.toCharArray();
		
		/*
		 * for (int i = 0; i < string.length; i++) {
		 * 
		 * count = 1;
		 * 
		 * for (int j = i + 1; j < string.length; j++) {
		 * 
		 * if (string[i] == string[j] && string[i] != ' ') { count++; string[j] = '0'; }
		 * } if (count > 1 && string[i] != '0') { System.out.println("Alphabet =>" +
		 * string[i] + " Count =>" + count);
		 * 
		 * } }
		 */
		
		Map<Character, Integer> mapCount= new HashMap<Character,Integer>();
		
		for(int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
			if(mapCount.containsKey(c)) {
				
				mapCount.put(c, mapCount.get(c)+1);
				count++;
			}else {
				mapCount.put(c, 1);
				
			}
			
		}
		
     //	Set<Map.Entry<Character,Integer>> entry= mapCount.entrySet();
     	
     	
		for (Map.Entry<Character,Integer> entry1 : mapCount.entrySet()) 
	        if (entry1.getValue() > 1)
	            System.out.println(entry1.getKey()+ " --> "+entry1.getValue());
	            System.out.println(" ");
	}
}

