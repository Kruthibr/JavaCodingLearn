package loopsCodeChallenges;

import java.util.ArrayList;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 21: Matrix Multiplication
		// Write a program that multiplies two matrices using nested loops.
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		ArrayList<Integer> mulmat = new ArrayList<Integer>();
		int[][] result = new int[a[0].length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				for (int k = 0; k < b[0].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
				mulmat.add(result[i][j]);
			}
		}
		System.out.println(mulmat);

	}

}
