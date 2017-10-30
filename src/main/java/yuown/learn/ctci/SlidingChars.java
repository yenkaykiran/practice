package yuown.learn.ctci;

public class SlidingChars {

	public static void main(String[] args) {
		String b = "abbc";
		String s = "cbabadcbbabbcbabaabccbabc";
		for (int i = 0; i < s.length(); i++) {
			boolean firstChar = b.contains(s.charAt(i) + "");
			if (firstChar) {
				int length = i + 4;
				if (length <= s.length()) {
					String perm = s.substring(i, length);
					boolean matching = true;
					for (int j = 0; j < perm.length(); j++) {
						if (!b.contains(perm.charAt(j) + "")) {
							matching = false;
							break;
						}
					}
					if (matching) {
						System.out.println(perm);
					}
				}
			}
		}
	}
}