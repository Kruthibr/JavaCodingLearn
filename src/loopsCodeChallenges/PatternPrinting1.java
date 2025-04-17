package loopsCodeChallenges;

public class PatternPrinting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Challenge 17: Pattern Printing
//		Write a program that prints the following pattern using nested loops:
//		     *
//		    ***
//		   *****
//		  *******
//		 *********

		for (int i = 1; i < 6; i++) {// 1
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
