package loopsCodeChallenges;

public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Challenge 7: Pattern Printing Write a program that prints the following
		 * pattern using nested loops: *
		 **
		 ***
		 ****
		 *****
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
