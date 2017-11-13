package yuown.hackerrank;

import java.util.Scanner;

public class LuckyPurchase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String found = null;
		long min = Integer.MAX_VALUE;
		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();
			int price = in.nextInt();
			char[] a = Integer.toString(price).toCharArray();
			if(a.length % 2 == 0) {
				int len4 = 0, len7 = 0;
				for (int i = 0; i < a.length; i++) {
					if (a[i] == '4') {
						len4++;
					} else if (a[i] == '7') {
						len7++;
					}
				}
				if (len4 > 0 && len4 == len7) {
					min = Math.min(min, price);
					found = s;
				}
			}
		}
		if (min == 0) {
			System.out.println(-1);
		} else {
			System.out.println(found);
		}
		in.close();
	}
}
