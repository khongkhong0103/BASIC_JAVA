package doifyourself;
 /*
  * Write an OOP program with a method to compute
  * the sum of the digits in an integer
  * */

public class ex4 {
	public static int sum(int num){
		int sum = 0;
		while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
       return sum;
	}
	public static void main(String[] args) {
		int a = 890;
		System.out.println(sum(a));
	}
}
