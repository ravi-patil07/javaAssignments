package com.assignment.java8;

import java.util.Arrays;
import java.util.List;

public class InsertStringIntoAnotherString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("hello ", " world");
		
	//	String str= "ravi";
	//	StringBuilder sb= new StringBuilder(str);
		StringBuffer sb= new StringBuffer();
		list.forEach(sb::append);
		
		System.out.println(sb.insert(4, "abc"));
		System.out.println(sb);
		
	}
}
