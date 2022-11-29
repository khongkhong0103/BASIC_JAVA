package doifyourself;

import java.util.Scanner;

public class ex10 {
	/*
	 * Write an OOP program to check if a string starts with a specified word
	 * entered from the keyboard
	 */


	public static void main(String[] args) {
		String str = "Toi la sinh vien";
		String string = str.toLowerCase();

		System.out.println("String input: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		if (str1.startsWith("toi")) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}

	}
}
