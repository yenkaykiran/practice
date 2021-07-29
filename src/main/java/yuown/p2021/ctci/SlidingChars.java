package yuown.p2021.ctci;

public class SlidingChars {
	
	public static void main(String[] args) {
		String s = "abbc";
		String b = "cbabadcbbabbcbabaabccbabc";
		int smallLength = s.length();
		int bigLength = b.length();
		for(int i = 0; i < bigLength; i++) {
			String c = b.charAt(i) + "";
			if(s.contains(c)) {
				int endIndex = i + smallLength;
				if(endIndex <= bigLength) {
					String perm = b.substring(i, endIndex);
					boolean match = true;
					for(int j = 0; j < perm.length(); j++) {
						if(count(s, s.charAt(j)) != count(perm, s.charAt(j))) {
							match = false;
							break;
						}
					}
					if(match) {
						System.out.println(i + " " + perm);
					}
				}
			}
		}
	}
	
	private static int count(String perm, char c) {
		int count = 0;
		for(int k = 0; k < perm.length(); k++) {
			if(perm.charAt(k) == c) {
				count++;
			}
		}
		return count;
	}

}
