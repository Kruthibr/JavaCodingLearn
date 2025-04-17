package loopsCodeChallenges;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 9: Count Vowels
		// Create a function that counts the number of vowels in a given string using a
		// loop.
		String str="Arrenhole";
		int count=0;
		String vowels="aeiouAEIOU";
		for(char c:str.toCharArray()) {
			if(vowels.indexOf(c)!=-1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
