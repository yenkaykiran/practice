package yuown.p2021.ctci;

public class PermutationsOfPalindrome {

	public static void main(String[] args) {
		String str = "Tact Coa";
		int[] counts = counts(str.toLowerCase().toCharArray());
		boolean isOddMax1 = isOddMax1(counts);
		if(isOddMax1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean isOddMax1(int[] counts) {
		boolean isOddFound = false;
		for(int c : counts) {
			if(c % 2 == 1) {
				if(isOddFound) {
					return false;
				}
				isOddFound = true;;
			}
		}
		return true;
	}

	private static int[] counts(char[] charArray) {
		int[] counts = new int[26];
		for(char ch : charArray) {
			int c = ch - 'a';
			if(c >= 0) {
				counts[c]++;
			}
		}
		return counts;
	}
	
}
