package com.assignment.arrays;

import java.util.Arrays;

public class SortArrayOnUnitPlaces {

	void countingSort(int array[], int size, int place) {
	    int[] output = new int[size + 1];
	    int max = array[0];
	    for (int i = 1; i < size; i++) {
	      if (array[i] > max)
	        max = array[i];
	    }
	    int[] count = new int[max + 1];

	    for (int i = 0; i < max; ++i)
	      count[i] = 0;

	    // Calculate count of elements
	    for (int i = 0; i < size; i++)
	      count[(array[i] / place) % 10]++;

	    // Calculate cumulative count
	    for (int i = 1; i < 10; i++)
	      count[i] += count[i - 1];

	    // Place the elements in sorted order
	    for (int i = size - 1; i >= 0; i--) {
	      output[count[(array[i] / place) % 10] - 1] = array[i];
	      count[(array[i] / place) % 10]--;
	    }

	    for (int i = 0; i < size; i++)
	      array[i] = output[i];
	  }
	
	
	public static void main(String args[]) {
	    int[] data = { 10,2,3,41,12,13,19,81,9 };
	    int size = data.length;
	    SortArrayOnUnitPlaces rs = new SortArrayOnUnitPlaces();
	    rs.countingSort(data, size, 1);
	    System.out.println("Sorted Array on the base of unit places : ");
	    System.out.println(Arrays.toString(data));
	  }
}
