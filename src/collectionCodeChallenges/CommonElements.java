package collectionCodeChallenges;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(7);
		list2.add(2);
		list2.add(9);
		list2.add(10);
		HashSet<Integer> set1 = new HashSet<>(list1);
		HashSet<Integer> set2 = new HashSet<>(list2);
		set1.retainAll(set2);
		ArrayList<Integer> list3 = new ArrayList<>(set1);
		System.out.println(list3);

	}

}
