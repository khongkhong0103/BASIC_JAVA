package doifyourself;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex8 {
	/*
	 * Write OOP program to swap the first and last element of an array (length must
	 * be at least 1) and create a new array
	 */
	public static void main(String[] args) {
		int[] arr = { 3, 4, 7 };
		System.out.println(Arrays.toString(arr));
		int x= arr[0];
		arr[0]= arr[arr.length-1];
		arr[arr.length-1] = x;
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
