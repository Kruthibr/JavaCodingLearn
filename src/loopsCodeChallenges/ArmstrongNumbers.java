package loopsCodeChallenges;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 11: Armstrong Numbers
		// Write a program that checks if a given number is an Armstrong number using a
		// loop.
		int num1 = 153;
		int j = num1;
		int sum1 = 0;
		while (j != 0) {
			int dig = j % 10;
			j = j / 10;
			sum1 = sum1 + (dig * dig * dig);
		}
		if (sum1 == num1)
			System.out.println(num1 + " is an armstrong number");
		else
			System.out.println(num1 + " is not a armstrong number");
		System.out.println();

		System.out.println("Armstrong number series from 1 to 2000 are:");
		for (int i = 1; i <= 2000; i++) {
			int num = i;// 1
			int sum = 0;
			while (num != 0) {
				int dig = num % 10;
				num = num / 10;
				sum = sum + (dig * dig * dig);
			}
			if (i == sum)
				System.out.println(i);
		}
	}

}
