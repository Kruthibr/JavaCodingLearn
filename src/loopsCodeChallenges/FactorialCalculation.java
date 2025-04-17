package loopsCodeChallenges;

public class FactorialCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 2: Factorial Calculation
		// Create a function that calculates the factorial of a given number using a
		// loop.
		int num = 5;
		int mul = 1;
		for (int i = 1; i <= num; i++) {
			mul = mul * i;
		}
		System.out.println(mul);

	}

}
