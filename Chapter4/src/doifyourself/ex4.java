package doifyourself;
 /*
  * Write an OOP program with a method to compute
  * the s of the digits in an integer
  * */

public class ex4 {
	public static int s(int n){
		int s = 0;
		while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
       return s;
	}
	public static void main(String[] args) {
		int a = 890;
		System.out.println(s(a));
	}
}
