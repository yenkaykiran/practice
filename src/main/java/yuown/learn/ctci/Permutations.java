package yuown.learn.ctci;

public class Permutations {

	public static void main(String[] args) {
		String primary = "abc";
		allPermutations(primary.toCharArray(), 0, primary.length());
	}

	private static void allPermutations(char[] chars, int k, int n) {
		if(k == n) {
			System.out.println(new String(chars));
		} else {
			for (int i = k; i < n; i++) {
				swap(chars, k, i);
				allPermutations(chars, k + 1, n);
				swap(chars, k, i);
			}
		}
	}

	private static void swap(char[] chars, int i, int j) {
		char c = chars[i];
		chars[i] = chars[j];
		chars[j] = c;
	}
}