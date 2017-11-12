package yuown.hackerrank;

public class MakeAnagrams {
	private static int TOTAL_CHARS = 26;

	private static int[] getCharCounts(String s) {
		int[] counts = new int[TOTAL_CHARS];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int offset = 'a';
			counts[c - offset]++;
		}
		return counts;
	}

	private static int getDiff(int[] f, int[] s) {
		int diff = 0;
		for (int i = 0; i < s.length; i++) {
			int d = Math.abs(f[i] - s[i]);
			diff += d;
		}
		return diff;
	}

	public static int numberNeeded(String first, String second) {
		int[] fCounts = getCharCounts(first);
		int[] sCounts = getCharCounts(second);
		return getDiff(fCounts, sCounts);
	}

	public static void main(String[] args) {
		System.out.println(numberNeeded("cde", "abc"));
	}
}