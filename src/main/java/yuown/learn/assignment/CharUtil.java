package yuown.learn.assignment;

public class CharUtil {

	public static void main(String[] args) {
		System.out.println(hasDuplicateChars("abracadabra"));
	}

	public static boolean hasDuplicateChars(String inputString) {
		boolean charSet[] = new boolean[128];
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if (charSet[c]) {
				return true;
			}
			charSet[c] = true;
		}
		return false;
	}
}
