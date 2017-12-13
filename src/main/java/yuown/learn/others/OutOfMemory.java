package yuown.learn.others;

public class OutOfMemory {
	public static void main(String[] args) {
		long[] l = new long[Integer.MAX_VALUE - 9];
	}
}
