package set;

import java.util.HashSet;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,1,2};
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for(int i:a) {
			hs1.add(i);
		}
		System.out.println(hs1);

	}

}
