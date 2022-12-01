package com.assignment.arrays;

public class HalfArrayAscDesc {

	public static void main(String[] args) {
		
		int [] numArr= {1,3,5,7,9,4,6,22,33,44,88,99};
		
		
		
		int temp;
		for(int i=0; i< (numArr.length)/2; i++) {
			
			for(int j=i+1; j< numArr.length; j++) {
				
				if(numArr[i] > numArr[j]) {
					temp=numArr[i];
					numArr[i]=numArr[j];
					numArr[j]=temp;
				}
			}
			
		}
		
		System.out.println(" \n\n First Half array in ascending order ::\n ");
				for (int num : numArr)
		    	System.out.print(num+" ");
		  
			for (int i = (numArr.length) / 2; i < numArr.length; i++) {
				for (int j = i + 1; j < numArr.length; j++) {
					if (numArr[i] < numArr[j]) {
						temp = numArr[j];
						numArr[j] = numArr[i];
						numArr[i] = temp;
					}
				}
			}
			System.out.println("\n \n Second Half of array in descending order ::\n ");
			for (int num : numArr)
				System.out.print( num+" ");
 		}
	   
	   
	}

