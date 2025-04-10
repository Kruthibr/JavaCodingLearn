package array;

public class CodeChallengesArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Max & Min value in multi dim Array
		System.out.println("Max & Min value in multi dim Array:");
		int a[][] = { { 1, 2, 3 }, { 5, 6, 0 }, { 9, 8, 7 } };
		// 1 2 3
		// 5 6 0
		// 9 8 7
		int min = a[0][0];
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
				}
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		System.out.println("Minimum " + min);
		System.out.println("Maximium " + max);

		// 2. Find min val and its col max value
		System.out.println("Find min val and its col max value:");
		int min1 = a[0][0];
		int max1 = a[0][0];
		int col = 0;
		for (int i = 0; i < a.length; i++) {// rows
			for (int j = 0; j < a.length; j++) {// col
				if (min1 > a[i][j]) {
					min1 = a[i][j];
					col = j;
				}
			}
		}

		int row = 0;
		while (row < a.length) {
			if (max1 < a[row][col]) {
				max1 = a[row][col];
			}
			row++;
		}
		System.out.println(
				"The least value is " + min1 + " in col " + col + " and the highest value in that col is " + max1);

		// 3. Array Sorting
		System.out.println("Array Sorting:");
		int b[] = { 1, 4, 3, 2 }; // 1, 2, 3, 4
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length + 1; j++) {
				if (b[i] < b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for (int x : b) {
			System.out.println(x);
		}
	}

}
