package codeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program that sorts a list of names using ArrayList and
		// Collections.sort().
		List<String> al = new ArrayList<String>();
		String s[] = { "zack", "miller", "ana", "keran", "bob" };
		al = Arrays.asList(s);
		Collections.sort(al);
		System.out.println(al);
	}
}
