package com.assignment.strings;

public class StringBuilderStringBufferPerf {

	// 5. To demonstrate which is fast in processing StringBuilder or StringBuffer

	public static void main(String[] args) {

		long sTime= System.currentTimeMillis();
		StringBuilder sb= new StringBuilder("java");
		for(int i=0; i<10000; i++) {
			sb.append("training");
		}
		long timeByStringBuilder = System.currentTimeMillis() - sTime;
		System.out.println("StringBuilder time taken "+timeByStringBuilder+" ms");
		
		
		StringBuffer sb1= new StringBuffer("java");
		for(int i=0; i<10000; i++) {
			sb1.append("training");
		}
		long timeByStringBuffer = System.currentTimeMillis() - sTime;
		System.out.println("StringBuffer time taken "+timeByStringBuffer+" ms");
	
	 
	    if(timeByStringBuilder > timeByStringBuffer ) {
	     System.out.println("StringBuilder is Faster");
	   }else {
		   System.out.println("StringBuffer is Faster");
	   }
	}
}
