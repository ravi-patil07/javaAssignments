package com.assignment.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumFromList {

	public static void main(String[] args) {
		
		int[] arr= {3,4,5,5,6,7,8,9,9};
		
	   int len=arr.length;
	   
	   
	   Map<Integer, Integer> mapCount= new HashMap<Integer,Integer>();
	   
	   for(int i=0; i<len; i++) {
		   
		   if(mapCount.containsKey(arr[i])) {
			   mapCount.put(arr[i], mapCount.get(arr[i])+1);
		   }else {
			   mapCount.put(arr[i], 1);
		   }
		   
	   }
		
	   for(Map.Entry<Integer, Integer> entry : mapCount.entrySet()) {
		   if(entry.getValue() > 1)
		   System.out.println("Duplicate Number=>"+entry.getKey()+" Count =>"+entry.getValue());
	   }
	}
}
