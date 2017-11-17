package yuown.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDSurfaceArea {

	static int surfaceArea(int[][] A) {
		int area = 0;
		int[][] a = new int[A.length][];
		int cols = 0, rows = 0;
		for (int i = 0; i < A.length; i++) {
			a[i] = new int[A[i].length];
			rows = A.length;
			for (int j = 0; j < A[i].length; j++) {
				cols = A[0].length;
				if (A[i][j] > 0) {
					a[i][j] = 2 + 4 * A[i][j];
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] > 0) {
					if (j == 0) {
						a[i][j] -= A[i][j];
					}
					if (j > 0) {
						a[i][j] -= A[i][j - 1];
					}
				}
			}
			for (int j = A[i].length - 1; j > 0; j--) {
				if (A[i][j] > 0) {
					a[i][j] -= A[i][j - 1];
				}
			}
		}
		System.out.println("A");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		int[][] b = new int[cols][rows];
		for (int i = 0; i < b.length; i++) {
			b[i] = new int[rows];
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (A[j][i] > 0) {
//					if (j == 0) {
//						b[i][j] -= A[j][i];
//					}
//					if (j > 0) {
//						b[i][j] -= A[j - 1][i];
//					}
				}
			}
		}

		System.out.println("B");
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				area += b[i][j];
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
