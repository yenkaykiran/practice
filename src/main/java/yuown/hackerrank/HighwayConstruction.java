package yuown.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class HighwayConstruction {
	static int highwayConstruction(long n, int k) {
		BigInteger s = BigInteger.ZERO;
		for (long i = 2; i <= n - 1; i++) {
			s = s.add(BigInteger.valueOf(i).pow(k).mod(BigInteger.valueOf(1000000009)));
		}
		System.out.println(s);
		return s.mod(BigInteger.valueOf(1000000009)).intValue();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			long n = in.nextLong();
			int k = in.nextInt();
			int result = highwayConstruction(n, k);
			System.out.println(result);
		}
		in.close();
	}
}
