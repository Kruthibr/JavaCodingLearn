package loopsCodeChallenges;

public class FindMaximuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 14: Find Maximum in Array
		// Implement a function that finds the maximum value in an array using a loop.
		int a[] = { 1, 2, 3, 4, 5, 6, 22, 3, 8, 8 };
		int max = a[0];
		for (int i : a) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("Maximum number in an array is " + max);
	}

}
