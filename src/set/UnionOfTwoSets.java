package set;

import java.util.HashSet;

public class UnionOfTwoSets {

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

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(1);
		hs2.add(2);
		hs2.add(3);
		hs2.add(8);
		hs2.add(9);
		hs2.add(10);
		hs2.add(11);

		HashSet<Integer> union = new HashSet<Integer>(hs1);
		union.addAll(hs2);
		System.out.println(union);

	}

}
