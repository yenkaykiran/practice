package yuown.visa;

public class MagicalStrings {

	public static void main(String[] args) {
		System.out.println(magicalStrings(10));
	}

	static int magicalStrings(int n) {
		int sum = 0;
		char[] a = new char[] { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < a.length; i++) {
			sum += options(n, a[i]);
		}
		return sum;
	}

	static int options(int l, char c) {
		if (l == 1) {
			return 1;
		} else {
			int total = 0;
			switch (c) {
			case 'a':
				total = options(l - 1, 'e');
				break;
			case 'e':
				total = options(l - 1, 'a') + options(l - 1, 'i');
				break;
			case 'i':
				total = options(l - 1, 'a') + options(l - 1, 'e')
					  + options(l - 1, 'o') + options(l - 1, 'u');
				break;
			case 'o':
				total = options(l - 1, 'i') + options(l - 1, 'u');
				break;
			case 'u':
				total = options(l - 1, 'a');
				break;
			}
			return total;
		}
	}
}
