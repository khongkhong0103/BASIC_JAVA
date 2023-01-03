package doifyourself;

public class ex13 {
 /* Write an oop program to reverse an array of integer values
  * 
  * */
	public static void main(String[] args) {
		int a[]= {2,1,4,5,7,6};
		/*
		 * 
		 * */
		System.out.println(a.length);
		for (int i =0;i<a.length/2;i++) {
			int b = a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1] =b;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
