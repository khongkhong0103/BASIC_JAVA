package doifyourself;

public class ex5 {
		public static int factorial(int n) {
			int kq = 1;
			for (int i = 1;i<=n;i++) {
				kq *=i;
			}
			return kq;
			
		}
		
		public static void arrFactorial(int arr[]) {
			
//			return n;
		}
		public static void main(String[] args) {
			System.out.println(factorial(4));
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			for (int i =1;i<=arr.length;i++) {
				System.out.println("Factorial: ["+i+"] = "+ factorial(i));
			}	
		}
}
