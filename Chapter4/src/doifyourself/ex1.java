package doifyourself;

import java.util.*;

/* ex1: write an oop program with a method to 
 * find the smallest number among
 * three numbers 
 * - Input: 3 random numbers
 * - Output: min 3 random numbers
 * 
 * Các xử lý khác: - c1: dùng if-else 
 * 				   - c2: toán tử điều kiện
 * 				   - c3: Sd Math.min() 
 * 				   - ....
 * Nâng cao: áp dụng trong mảng
 * 
 * */
public class ex1 { 
	// Cách 3
	// Hàm tìm số nhỏ nhất
	public static double Min(int a, int b, int c) {
		// hàm Math.min()có sẳn của java, để trả về Minimum or Lowest
		return Math.min(Math.min(a, b), c);
	}

	// Với array: Tìm phần tử min và max trong array
	public static int minArray(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.print("3 số ngẫu nhiên: ");
		// Random class sinh ra số ngẫu nhiên
		Random rand = new Random();
		int number1 = rand.nextInt();
		int number2 = rand.nextInt();
		int number3 = rand.nextInt();
		System.out.println(number1 + ", " + number2 + ", " + number3);
		System.out.println("Số nhỏ là: " + Min(number1, number2, number3));

		// array
		int arr[]= {3,4,6,7,8};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("min: "+minArray(arr));
		
	}
}
