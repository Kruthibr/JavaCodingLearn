package set;

import java.util.HashSet;

public class SetDemo {

	/*
	 * 2. Set: its an collection which can not contain dupes and will guarantee the
	 * order Types: HashSet, LinkedHashSet, TreeSet
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(4);
		hs1.add(6);
		hs1.add(7);
		for (int i : hs1) {
			System.out.println(i);
		}
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(1);
		hs2.add(2);
		hs2.add(3);
		hs2.add(8);
		hs2.add(9);
		hs2.add(10);
		hs2.add(11);

		// Union Intersection and difference

		HashSet<Integer> union = new HashSet<>(hs1);
		union.addAll(hs2);
		System.out.println(union);
		HashSet<Integer> intersection = new HashSet<>(hs1);
		intersection.retainAll(hs2);
		System.out.println(intersection);
		HashSet<Integer> diff = new HashSet<>(hs1);
		diff.removeAll(hs2);
		System.out.println(diff);
		System.out.println(hs1);
		hs1.remove(1);
		System.out.println(hs1);
		System.out.println(hs1.contains(1));
	}

}
