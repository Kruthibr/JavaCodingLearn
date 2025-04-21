package collectionCodeChallenges;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		HashSet<Integer> hs = new HashSet<Integer>(list);// as hash set can not contain dupes
		System.out.println(hs); // converted AL to HS
	}

}
