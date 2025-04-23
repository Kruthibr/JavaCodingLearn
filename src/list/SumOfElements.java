package collectionCodeChallenges;

import java.util.ArrayList;

public class SumOfElements {

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int total = sum(list);
		System.out.println("Sum of elements: " + total); // Output: Sum of elements: 15
	}

}
