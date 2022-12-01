package com.assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemovewDuplicatesFromList {

	public static void main(String[] args) {
		
	
		List<Integer> list = new ArrayList<>(Arrays.asList(5,3,1, 2, 3, 4, 1, 3));
		System.out.println("ArrayList with duplicate elements " + list);

		List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
   
		Collections.sort(list1);
		
	//  for Descending order	
	//	Collections.sort(list1, Collections.reverseOrder());   
		
		System.out.println("ArrayList without duplicate elements:" + list1);
		/*
		 * Set<Integer> set= new LinkedHashSet<Integer>();
		 * 
		 * set.addAll(list);
		 * 
		 * list.clear();
		 * 
		 * list.addAll(set);
		 */
		
	}
}
