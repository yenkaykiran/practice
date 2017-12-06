package yuown.hackerrank;

import java.util.Scanner;

public class TripleRecursion {
	static void tripleRecursion(int n, int m, int k) {
        int[][] a = new int[n][n];
        func(a, 0, 0, m, k);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

	private static void func(int[][] a, int i, int j, int m, int k) {
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		tripleRecursion(n, m, k);
		in.close();
	}
}
