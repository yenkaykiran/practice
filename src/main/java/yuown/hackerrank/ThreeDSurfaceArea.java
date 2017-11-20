package yuown.hackerrank;

import java.util.Scanner;

public class ThreeDSurfaceArea {

	static long surfaceArea(int[][] A) {
		int area = 2 * A.length * A[0].length;
		int dx[] = { 0, 0, 1, -1 };
		int dy[] = { 1, -1, 0, 0 };

		int[][] B = new int[A.length + 2][A[0].length + 2];
		for (int i = 1; i <= A.length; i++) {
			B[i] = new int[A[0].length + 2];
			for (int j = 1; j <= A[i - 1].length; j++) {
				B[i][j] = A[i - 1][j - 1];
			}
		}

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

		for (int x = 1; x <= A.length; x++) {
			for (int y = 1; y <= A[0].length; y++) {
				for (int i = 0; i < 4; i++) {
					int x_ = x + dx[i];
					int y_ = y + dy[i];
//					System.out.println("B[x][y] = " + B[x][y]);
//					System.out.println("B[x_][y_] = " + B[x_][y_]);
					area += Math.max(0, B[x][y] - B[x_][y_]);
				}
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
		long result = surfaceArea(A);
		System.out.println(result);
		in.close();
	}
}
