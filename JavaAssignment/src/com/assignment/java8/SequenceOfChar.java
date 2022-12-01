package com.assignment.java8;

import java.util.Arrays;

public class SequenceOfChar {

	public static void main(String[] args) {
		
		String [] str = {"Taj is situated in Agra"};
		
		String find = "ast";
		
		boolean seqStr = Arrays.stream(str).anyMatch(m-> m.contains(find));
		
		if(seqStr ==true) {
			System.out.println(find+ " String found ");
		}else {
			System.out.println(find+" String not found ");
		}
	}
}
