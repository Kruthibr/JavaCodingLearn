package loopsAndConditions;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		System.out.println("Pyramid:1");
		for (int i = 1; i <= 4; i++) {// 4 times
			for (int j = 1; j <= 5 - i; j++) {// 1st-4 times, 2nd-3..
				System.out.print(j + "\t");
			}
			System.out.println();
		}

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		System.out.println("Pyramid:2");
		for (int i = 1; i <= 4; i++) {// 4 times
			for (int j = 1; j <= i; j++) {// 1st-1 time, 2nd-2..
				System.out.print(j + "\t");
			}
			System.out.println();
		}

		int num = 1;

		System.out.println("Pyramid:3");
		for (int i = 1; i <= 4; i++) {// 4 times
			for (int j = 1; j <= 5 - i; j++) {// 1st-4 times, 2nd-3..
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}

		System.out.println("Pyramid:4");
		for (int i = 1; i <= 4; i++) {// 4 times
			for (int j = 1; j <= i; j++) {// 1st-1 time, 2nd-2..
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}

		System.out.println("Pyramid:5");
		// 3
		// 6 9
		// 12 15 18
		int d = 3;
		for (int i = 1; i <= 3; i++) {// 3 times
			for (int j = 1; j <= i; j++) {
				System.out.print(d + "\t");
				d = d + 3;
			}
			System.out.println();
		}
	}

}
