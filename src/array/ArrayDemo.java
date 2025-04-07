package array;

public class ArrayDemo {

	// Array - container multiple values of same data type
	public static void main(String[] args) {

		System.out.println("Array declration type1:");
		int a[] = new int[5];// you should pre define the size
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array declration type2:");
		int b[] = { 1, 2, 3, 4, 5 };// size will be defined based on num of values
		for (int v : b) { // short hand for
			System.out.println(v);
		}
		System.out.println("Multi Dim Array declration type1:");
		int c[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };// 3X2
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(c[i][j]);
			}
		}
		System.out.println("Multi Dim Array declration type2:");
		int d[][] = new int[2][3];// 2X3
		d[0][0] = 1;
		d[0][1] = 2;
		d[0][2] = 3;
		d[1][0] = 4;
		d[1][1] = 5;
		d[1][2] = 6;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(d[i][j]);
			}
		}
	}
}
