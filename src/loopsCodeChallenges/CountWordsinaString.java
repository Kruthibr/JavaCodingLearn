package loopsCodeChallenges;

public class CountWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 15: Count Words in a String
		// Write a program that counts the number of words in a given string using a
		// loop.
		String str = "hellowkx  bjhd";
		int count = 0;
		System.out.println("String length including spaces " + str.length());
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				count++;
			}
		}
		System.out.println("String length excluding spaces " + count);

	}

}
