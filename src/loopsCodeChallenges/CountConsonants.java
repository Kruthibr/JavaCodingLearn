package loopsCodeChallenges;

public class CountConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 20: Count Consonants
		// Write a program that counts the number of consonants in a given string using
		// a loop.
		String str = "arndhjddjkddejiou";
		String vowels = "aeiou";
		System.out.println("String actual length " + str.length());
		int count = 0;
		for (char c : str.toCharArray()) {
			if (vowels.indexOf(c) == -1) {
				count++;
			}
		}
		System.out.println("Consonants in string " + count);
	}

}
