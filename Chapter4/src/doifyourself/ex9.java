package doifyourself;

import java.util.Arrays;

public class ex9 {
		/*
		 *  Write an OOP program to multiply 
		 *  corresponding elements of two array of integers
		 * */
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {2,3,4};
		int newLength = Math.min(arr1.length, arr2.length);
	    int[] c = new int[newLength];

	    for (int index = 0; index < newLength; index++) {
	        c[index] = arr1[index] * arr2[index];
	    }
	    
	    System.out.println(Arrays.toString(c));
	}
}
