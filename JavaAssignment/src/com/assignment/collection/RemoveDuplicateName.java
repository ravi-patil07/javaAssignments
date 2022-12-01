package com.assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateName {
 // 4. WAP to store elements in List and remove all duplicates names of items.
	public static void main(String[] args) {
		
		List<String> strList= new ArrayList<>(Arrays.asList("ravi", "amit", "ravi", "akash"));
		
		System.out.println("List with duplicate elements "+strList);
		
		List<String> str= strList.stream().distinct().collect(Collectors.toList());
		
		Collections.sort(str, Collections.reverseOrder());
		
		System.out.println("List without duplicate elements "+str);
		
	}
}
