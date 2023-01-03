package doifyourself;

/*
 * Write an OOP program with a method to count all vowels in string
 * 
 * vowels: a, e, i,o, u
 * Input: 1 string
 * output: số lượng vowels
 * 
 * */

public class ex2 {
	public static int vowels(String str) {
		int count = 0; // biến đếm
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String str1 = str.toLowerCase(); // chuyển ký tự hoa thành thường
		char[] strInput = str1.toCharArray(); // chuyển sang ký tự 
		// dùng vòng lặp đển so sáng các ký tự trùng nhau
		for (int i = 0; i <= strInput.length - 1; i++) {
			for (int j = 0; j <= vowels.length - 1; j++) {
				if (strInput[i] == vowels[j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str = "adse asada";
		System.out.println("vowels in string are: " + vowels(str));
	}

}
