package loopsCodeChallenges;

public class SumofSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 18: Sum of Squares
		// Write a program that calculates the sum of squares of all numbers from 1 to
		// 50 using a loop.
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);
	}

}
