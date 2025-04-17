package loopsCodeChallenges;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 3: Reverse a String
		// Write a program that reverses a given string using a loop.
		String a = "Hello";
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
	}

}
