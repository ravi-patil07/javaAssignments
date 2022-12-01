package com.assignment.strings;

public class GarbageCollectorDemo {

	public static void main(String[] args) {
		
		String str1= new String("java");
		System.out.println(str1);
		str1=null;
		
		String str2= "training";
		System.out.println(str2);
		
		String str3= new String("String3");
		str3=str2;
		System.out.println(str3);
		
		System.gc();
		System.out.println("garbage collector called ==> "+str1+" "+str2+" "+str3);
	}
}
