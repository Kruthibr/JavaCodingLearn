package codeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given a list of integers, write a program to find all unique elements using a
		// HashSet.
		int a[] = { 1, 2, 3, 4, 2, 1, 5 };
		List<Integer> al = new ArrayList<Integer>();
		for (int num : a) {
			al.add(num);
		}
		HashSet<Integer> hs = new HashSet<Integer>(al);

		System.out.println(hs);
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
