package collections;

import java.util.ArrayList;

public class CodeChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 1, 5, 6, 2 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (!al.contains(a[i])) {
				count++;
				al.add(a[i]);
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println("Element " + a[i] + " is present for " + count + " times");
			}
		}
		System.out.println("Unique Elements of the Array: " + al);

	}

}
