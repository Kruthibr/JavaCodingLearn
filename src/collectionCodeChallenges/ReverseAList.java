package collectionCodeChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("Original List: " + al);
		Collections.reverse(al); // Collections : manipulated the original list
		System.out.println("Reversed List: " + al);

	}

}
