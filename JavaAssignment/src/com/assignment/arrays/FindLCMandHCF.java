package com.assignment.arrays;

public class FindLCMandHCF {

	public static void main(String[] args) {
		
		int[] myArray = { 8, 4, 2, 16 };

		// initialize LCM and HCM with the first element
				int lcm = 0;
				int hcf = 0;
				
				for (int i = 0; i < myArray.length; i++) {
					if (i == 0) {
						lcm = myArray[i];
						hcf = myArray[i];
					} else {
						hcf = findHCF(myArray[i], lcm);
						lcm = (lcm * myArray[i]) / hcf;
					}
				}
				
				// output the LCM
				System.out.println("LCM: " + lcm);

				// output the HCF
				System.out.println("HCF: " + hcf);
			}
	// recursive function to find HCF of two numbers
		public static int findHCF(int a, int b) {
			// base condition
			if (b == 0)
				return a;

			return findHCF(b, a % b);
		}
	
}
