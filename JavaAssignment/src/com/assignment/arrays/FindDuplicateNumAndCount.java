package com.assignment.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateNumAndCount {

	//  WAP to find duplicate numbers and there counting from list of numbers.
    
	public static void main(String[] args) {
	
		List<Integer> numberList= Arrays.asList(4,5,8,9,2,10,5,3,4,1);
		
		Map<Integer, Integer> countMap= new HashMap<>();
		
		for(int num : numberList) {
			
			if(countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num)+1);
			}else {
				countMap.put(num, 1);
			}
		}
		
		countMap.forEach((key, value)->{
			if(value>1)
				System.out.println("Number " +key+ " Duplicate "+value);
		});
		
	}
}
