package list;

import java.util.ArrayList;
import java.util.Collections;

public class CheckForPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('m');
		al.add('a');
		al.add('t');
		System.out.println(al);
		ArrayList<Character> revAl = new ArrayList<Character>(al);
		Collections.reverse(revAl);
		System.out.println(al.equals(revAl));
		boolean res = isPalindrome(al);
		if (res)
			System.out.println("Yes Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

	public static boolean isPalindrome(ArrayList<Character> list) {
		int left = 0;
		int right = list.size() - 1;
		while (left < right) {
			if (!list.get(left).equals(list.get(right))) {
				System.out.println(false);
			}

			left++;
			right--;
		}
		return true;

	}

}
