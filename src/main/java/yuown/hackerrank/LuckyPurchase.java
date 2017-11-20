package yuown.hackerrank;

import java.util.Scanner;

public class LuckyPurchase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String found = "-1";
		long min = Integer.MAX_VALUE;
		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();
			int price = in.nextInt();
			int p = price;
			if (p >= 1 && p <= 1000000000) {
				int len4 = 0, len7 = 0;
				while (p > 0) {
					int rem = p % 10;
					if (rem == 4) {
						len4++;
					} else if (rem == 7) {
						len7++;
					} else {
						len4 = 0;
						break;
					}
					p = p / 10;
				}
				if (len4 > 0 && len4 == len7) {
					if (price < min) {
						min = price;
						found = s;
					}
				}
			}
		}
		System.out.println(found);
		in.close();
	}
}
