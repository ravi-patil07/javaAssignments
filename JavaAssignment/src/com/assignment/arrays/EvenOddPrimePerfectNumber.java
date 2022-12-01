package com.assignment.arrays;

public class EvenOddPrimePerfectNumber {

	public static void countEvenOdd(int [] arr, int sizeArr) {
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0; i<sizeArr; i++) {
			if(arr[i] % 2==0) 
				evenCount++;
			else 
				oddCount++;
			
		}
		System.out.println("evencout "+evenCount+" oddcount "+oddCount);
	}
	
	static void isPrimeNumber(int[] arr, int sizeArr) {
	
		int count = 0;
		for (int k = 0; k < sizeArr; k++) {

			int i, m = 0, flag = 0;

			int n = arr[k];

			m = n / 2;

			if (n == 0 || n == 1) {
			} else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0)
					count++;

			}
		}
		System.out.println("Count of Prime numbers=" + count);
	}
	
	static void isPerfect(int arr[], int sizeArr) {

		int count = 0;
		for (int k = 0; k < sizeArr; k++) {
			int num = arr[k];
			long sum = 0;

			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {

					sum = sum + i;
				}
			}
			if (sum == arr[k])
				count++;
		}
		System.out.println("Count of Perfect numbers=" + count);
	}
	
	public static void main(String[] args) {
		
		int [] arr= {2, 3, 4, 5, 6};
		int sizeArr= arr.length;
		countEvenOdd(arr, sizeArr);
		isPrimeNumber(arr, sizeArr);
		isPerfect(arr, sizeArr);
	}
}
