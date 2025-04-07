package loopsAndConditions;

public class CodeChallengesForLoop {

	public static void main(String[] args) {
		// 1.Sum of Natural Numbers
		System.out.println("Sum of Natural Numbers");
		int n = 10;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		// 2.Factorial of a Number
		// 5!=5x4x3x2x1=120
		System.out.println("Factorial of a Number");
		int num = 5;
		int mul = 1;
		for (int i = 1; i <= num; i++) {
			mul = mul * i;
		}
		System.out.println(mul);

		// 3.Multiplication Table
		System.out.println("Multiplication Table");
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

		// 4.Reverse a String
		System.out.println("Reverse a String");
		String s = "Hello";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// 5.Check Prime Number
		System.out.println("Check Prime Number");
		int pnum = 31;
		boolean flag = true;
		for (int i = 2; i <= pnum / 2; i++) {
			if (pnum % i == 0) {
				flag = false;
			}
		}
		if (flag)
			System.out.println(pnum + " is a prime number");
		else
			System.out.println(pnum + " is not a prime number");

		// 6.Print a Full Pyramid Pattern
		System.out.println("Print a Full Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");// 1-5, 2-4, 3-2
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");// 2*1-1=1, 2*2-1=3, 2*3-1=5
			}
			System.out.println();
		}
		// 7.Print a Full Reverse Pyramid Pattern
		System.out.println("Print a Full Reverse Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");// 1-1 2-2
			}
			for (int j = i; j <= 5 * 2 - i; j++) {
				System.out.print("*");// 1-9, 2-4
			}
			System.out.println();
		}

		// 8.Print a Diamond Pattern
		System.out.println("Print a Diamond Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");// 1-5, 2-4
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");// 2*1-1=1, 2*2-1=3, 2*3-1=5
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");// 1-1, 2-2
			}
			for (int j = i; j <= 5 * 2 - i; j++) {
				System.out.print("*");// 5*2-1-9, 5*2-1=7
			}
			System.out.println();
		}

		// 9.Print Simple half Pyramid Pattern
		System.out.println("Print Simple half Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");// 1-1, 2-2
			}
			System.out.println();
		}

		// 10.Print Simple reverse half Pyramid Pattern
		System.out.println("Print Simple reverse half Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");// 1-5, 2-4
			}
			System.out.println();
		}

		// 11.Print a Hollow Diamond Pattern
		System.out.println("Print a Hollow Diamond Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");// 1-5
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1)
					System.out.print("*");// 2*1-1=1, 2*2-1=3, 2*3-1-5
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");// 1-1
			}
			for (int j = i; j <= 5 * 2 - i; j++) {
				if (j == i || j == 5 * 2 - i)
					System.out.print("*");// 1-9,
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		// 12.Print all even numbers between 1 to 100 using for loop
		System.out.println("print all even numbers between 1 to 10 using for loop");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 13.print all odd numbers between 1 to 100 using for loop
		System.out.println("print all odd numbers between 1 to 100 using for loop");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
