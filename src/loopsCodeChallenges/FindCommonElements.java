package loopsCodeChallenges;

public class FindCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 19: Find Common Elements
		// Create a function that finds common elements between two arrays using loops.
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				System.out.println(a[i]);
			}
		}
	}

}
