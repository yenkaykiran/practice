package yuown.p2021.ctci;

public class CheckPermutationString {

	public static void main(String[] args) {
		String s1 = "abdb c";
		String s2 = "babcd ";
		
		if(isPermutation(s1, s2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] counts = new int[128];
		for(char c : s1.toCharArray()) {
			counts[c]++;
		}
		for(char c : s2.toCharArray()) {
			counts[c]--;
			if(counts[c] < 0) {
				return false; 
			}
		}
		return true;
	}
}
