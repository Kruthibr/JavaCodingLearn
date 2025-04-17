package loopsCodeChallenges;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 12: Palindrome Check
		// Create a function that checks if a given string is a palindrome using a loop.
		String str = "Madam";
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equalsIgnoreCase(str))
			System.out.println(str + " is a plaindrome");
		else
			System.out.println(str + " is not a plaindrome");
	}

}
