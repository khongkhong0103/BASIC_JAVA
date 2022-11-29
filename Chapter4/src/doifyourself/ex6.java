package doifyourself;

public class ex6 {
	public static void vowels(int str) {
		int[] count = {1, 2, 3, 4, 5};
		 
		for (int i = 0; i < count.length ; i++) {
			for (int j = i; j < count.length ; j++) {
				if (count[i] > count[j]) {
					 int temp = count[i];
					 count[i] = count[j];
					 count[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println("vowels in string are: " );
	}

}
