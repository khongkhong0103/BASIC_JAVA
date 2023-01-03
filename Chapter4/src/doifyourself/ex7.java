package doifyourself;
	/*write an oop program to check
	 * if the first and the last element
	 * of an array of integer are same */
public class ex7 {
	public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		// phai check d dai cua mang >=2
		System.out.println(arr[0]);
		if (arr[0] == arr[arr.length-1]) {
			System.out.println("trung");
		}
		else {
			System.out.println("ko");
		}
		System.out.println(arr[arr.length-1]);
	}

}
