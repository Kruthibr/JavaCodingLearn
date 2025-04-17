package loopsCodeChallenges;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 8: Sum of Digits
		// Write a program that calculates the sum of digits of a given number using a
		// loop.
		int num = 123;// 1+2+3=6
		int sum = 0;
		while (num != 0) {
			int dig;
			dig = num % 10;// 3 2 1
			num = num / 10;// 12 1 0
			sum = sum + dig;
		}
		System.out.println(sum);

	}

}
