package loopsCodeChallenges;

import java.util.ArrayList;

public class RemoveDuplicatesfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 16: Remove Duplicates from Array
		// Create a function that removes duplicate elements from an array using a loop.
		int a[] = { 1, 2, 4, 5, 6, 7, 8, 6, 1, 2 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " " + count);
			}
		}
		System.out.println(al);

	}

}
