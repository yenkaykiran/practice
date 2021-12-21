package yuown.p2021;

public class RepeatedStrings {

	public static void main(String[] args) {
		// System.out.println(repeatedString("gfcaaaecbg", 547602l));
		// System.out.println(repeatedString("aba", 10l));
		System.out.println(repeatedString("a", 1000000000000l));
	}

	public static long repeatedString(String s, long n) {
		// Write your code here
		int len = s.length();
		long div = n / len;
		long rem = n % len;
		long count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a') {
				count++;
			}
		}
		if (count > 0) {
			count = count * div;
			for (int i = 0; i < rem; i++) {
				if (s.charAt(i) == 'a') {
					count++;
				}
			}
		}
		return count;
	}
}
