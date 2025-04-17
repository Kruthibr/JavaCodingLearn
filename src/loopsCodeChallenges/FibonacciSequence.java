package loopsCodeChallenges;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 5: Fibonacci Sequence
		// Write a program that prints the first 20 numbers of the Fibonacci sequence
		// using a loop.
		// 0 1 1 2 3 5 8
		int a = 0;
		int b = 1;

		int sum = 0;
		int i = 1;
		System.out.println(a);
		System.out.println(b);
		while (i <= 18) {// 5 itr
			sum = a + b;// 8
			System.out.println(sum);// 1 2 3 5 8
			a = b;// 5
			b = sum;// 8
			i++;
		}
	}

}
