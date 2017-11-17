package yuown.hackerearth;

import java.util.Scanner;

public class RopeFire {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int L = s.nextInt();
			int time = 0;
			int[] u = new int[L];
			int[] l = new int[L];
			for (int j = 0; j < L - 1; j++) {
				u[j] = s.nextInt();
			}
			for (int j = 0; j < L - 1; j++) {
				l[j] = s.nextInt();
			}
			time = 0;
			for (int k = 1; k < L; k++) {
				int max = Math.max(k + u[k - 1], k + l[k - 1]);
				System.out.println("M: " + max);
				time = Math.max(time, max);
				System.out.println("T: " + time);
			}
			System.out.println(time);
		}
	}
}
