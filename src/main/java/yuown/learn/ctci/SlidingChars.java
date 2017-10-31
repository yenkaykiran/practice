package yuown.learn.ctci;

public class SlidingChars {

	public static void main(String[] args) {
		String b = "abbc";
		String s = "cbabadcbbabbcbabaabccbabc";

		int smallLength = b.length();
		int bigLength = s.length();
		for (int i = 0; i < bigLength; i++) {
			boolean firstCharMatch = b.contains(s.charAt(i) + "");
			if (firstCharMatch) {
				int length = i + smallLength;
				if (length <= bigLength) {
					String perm = s.substring(i, length);
					boolean matching = true;
					for (int j = 0; j < smallLength; j++) {
						if (count(b, perm.charAt(j)) != count(perm, perm.charAt(j))) {
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

	private static int count(String string, char charToFind) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == charToFind) {
				count++;
			}
		}
		return count;
	}
}