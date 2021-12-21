package yuown.p2021.ctci;

public class URLify {
	
	public static void main(String[] args) {
		String str = "Mr Jo hn Smith      ";//%20
		int trueLen = 14;
		String urlled = replaceSpaces(str.toCharArray(), trueLen);
		System.out.println(urlled);
	}

	private static String replaceSpaces(char[] arr, int trueLen) {
		int maxIndex = 0, spaceCount = 0;
		for(int i = 0; i < trueLen; i++) {
			if(arr[i] == ' ') {
				spaceCount++;
			}
		}
		maxIndex = trueLen + spaceCount * 2;
		for(int j = trueLen - 1; j >= 0; j--) {
			if(arr[j] == ' ') {
				arr[maxIndex - 1] = '0';
				arr[maxIndex - 2] = '2';
				arr[maxIndex - 3] = '%';
				maxIndex -= 3;
			} else {
				arr[maxIndex - 1] = arr[j];
				maxIndex--;
			}
		}
		return new String(arr);
	}

}
