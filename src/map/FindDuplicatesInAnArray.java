package map;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 1, 2 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : a) {
			if (!hm.containsKey(i)) {
				hm.put(i, 1);
			} else {
				hm.put(i, hm.get(i) + 1);
			}
		}
		System.out.println(hm);
		System.out.println("Duplicate entries in an array");
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " is present for " + entry.getValue() + " times ");
			}
		}

	}
}