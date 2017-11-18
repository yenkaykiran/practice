package yuown.hackerrank;

// Java prorgam for finding max path in matrix

import static java.lang.Math.max;

class MatrixRecursion {
	public static int N = 4, M = 5;

	// Function to calculate max path in matrix
	static int findMaxPath(int mat[][]) {
		// To find max val in first row
		int res = -1;
		for (int i = 0; i < M; i++)
			res = max(res, mat[0][i]);

		for (int i = 1; i < N; i++) {
			res = -1;
			for (int j = 0; j < M; j++) {
				// When all paths are possible
				if (j > 0 && j < M - 1)
					mat[i][j] += max(mat[i - 1][j], max(mat[i - 1][j - 1], mat[i - 1][j + 1]));

				// When diagonal right is not possible
				else if (j > 0)
					mat[i][j] += max(mat[i - 1][j], mat[i - 1][j - 1]);

				// When diagonal left is not possible
				else if (j < M - 1)
					mat[i][j] += max(mat[i - 1][j], mat[i - 1][j + 1]);

				// Store max path sum
				res = max(mat[i][j], res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arrA[][] = { { 1, 2, 3, -1, -2 }, { -5, -8, -1, 2, -150 }, { 1, 2, 3, -250, 100 }, { 1, 1, 1, 1, 20 } };
		System.out.println(findMaxPath(arrA));

	}

}
