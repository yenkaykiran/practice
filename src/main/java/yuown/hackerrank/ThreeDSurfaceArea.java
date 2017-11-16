package yuown.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDSurfaceArea {

	static int surfaceArea(int[][] A) {
		int area = 0;
		int[][] a = new int[A.length][];
		for (int i = 0; i < A.length; i++) {
			a[i] = new int[A[i].length];
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] > 0) {
					a[i][j] = 2 + 4 * A[i][j];
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] > 0) {
					if (j > 0) {
						if (A[i][j] > A[i][j - 1]) {
							a[i][j] -= A[i][j - 1];
						} else if (A[i][j] < A[i][j - 1]) {
							a[i][j - 1] -= A[i][j - 1];
						} else {
							a[i][j] -= A[i][j - 1];
						}
					}
					if (j == 0 && A[i].length > 1) {
						if (A[i][j] > A[i][j + 1]) {
							a[i][j] -= A[i][j + 1];
						} else if (A[i][j] < A[i][j + 1]) {
							a[i][j] -= A[i][j];
						}
					}

					if (i > 0) {
						if (A[i][j] > A[i - 1][j]) {
							a[i][j] -= A[i - 1][j];
						} else if (A[i][j] < A[i - 1][j]) {
							a[i - 1][j] -= A[i - 1][j];
						} else {
							a[i][j] = A[i - 1][j];
						}
					}

					if (i == 0 && A.length > 1) {
						if (A[i][j] > A[i + 1][j]) {
							a[i][j] -= A[i + 1][j];
						} else if (A[i][j] < A[i + 1][j]) {
							a[i][j] -= A[i][j];
						}
					}

				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				area += a[i][j];
			}
		}
		return area;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int[][] A = new int[H][W];
		for (int A_i = 0; A_i < H; A_i++) {
			for (int A_j = 0; A_j < W; A_j++) {
				A[A_i][A_j] = in.nextInt();
			}
		}
		int result = surfaceArea(A);
		System.out.println(result);
		in.close();
	}
}
