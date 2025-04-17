package loopsCodeChallenges;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 4: Multiplication Table
		// Generate a multiplication table for numbers 1 to 10 using nested loops.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "'s Table:");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

}
