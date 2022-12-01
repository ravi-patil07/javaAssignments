package com.assignment.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<>();
		
		map.put("mumbai", 2000000);
		map.put("pune", 1000000);
		map.put("nasik", 500000);
		
		System.out.println("Map without sorting elements "+map);
		
		TreeMap<String, Integer> treeMap= new TreeMap<>(map);
		System.out.println("Map with sorting elements "+treeMap);
		
	}
}
