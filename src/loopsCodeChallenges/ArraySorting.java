package loopsCodeChallenges;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 10: Array Sorting
		// Implement a sorting algorithm (like bubble sort) using loops to sort an array
		// of integers.
		int a[] = { 1, 8, 6, 2, 3, 5, 4, 7 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {// 8>6
					temp = a[i];// 8
					a[i] = a[j];// 6
					a[j] = temp;// 8
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}

	}

}
