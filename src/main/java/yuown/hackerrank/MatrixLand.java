package yuown.hackerrank;

import java.util.Scanner;

public class MatrixLand {
	static int matrixLand(int[][] count) {
		int score = 0;
		for (int i = 0; i < count.length; i++) {
			int[][] cloned = count.clone();
			int current = calculateCount(i, cloned);
			score = Math.max(current, score);
		}
		return score;
	}

	private static int calculateCount(int i, int[][] cloned) {
		int count = 0;
		for (int j = i; j < cloned.length; j++) {
			for (int k = 0; k < cloned.length; k++) {
				
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] A = new int[n][m];
		for (int A_i = 0; A_i < n; A_i++) {
			for (int A_j = 0; A_j < m; A_j++) {
				A[A_i][A_j] = in.nextInt();
			}
		}
		int result = matrixLand(A);
		System.out.println(result);
		in.close();
	}
}
