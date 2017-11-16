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
			for (int k = 0; k < L; k++) {
				time++;
				if (k > 0 && k < L - 1) {
					int diff = Math.abs(u[k - 1] - l[k - 1]);
					time += diff;
					time += 1;
				}
			}
			System.out.println(time);
		}
	}
}
