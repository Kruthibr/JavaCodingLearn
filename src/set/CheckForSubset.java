package set;

import java.util.HashSet;

public class CheckForSubset {

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

		System.out.println(hs1.containsAll(hs2));

	}

}
