package loopsCodeChallenges;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 6: Prime Numbers
		// Create a function that finds all prime numbers between 1 and 100 using a
		// loop.
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(i);
		}

	}

}
