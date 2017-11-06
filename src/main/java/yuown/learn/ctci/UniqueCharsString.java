package yuown.learn.ctci;

public class UniqueCharsString {
	public static void main(String[] args) {
		String str = "abcdeafbd";
		if (isAllCharsUnique(str)) {
			System.out.println("Unique Characters in String");
		} else {
			System.out.println("Not Unique Characters in String");
		}
	}

	private static boolean isAllCharsUnique(String str) {
		boolean flags[] = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int place = str.charAt(i);
			if (flags[place]) {
				return false;
			}
			flags[place] = true;
		}
		return true;
	}
}
