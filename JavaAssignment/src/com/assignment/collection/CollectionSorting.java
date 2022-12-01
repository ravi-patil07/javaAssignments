package com.assignment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. WAP to sort Collection elements in ascending order.
public class CollectionSorting {

public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		
		list.add("ravi");
		list.add("amit");
		list.add("akash");
		list.add("rohit");
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}
