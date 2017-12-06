package yuown.java.strings;

public class StringPool {
	public static void main(String[] args) {
		String ref1 = "hello";
		String ref2 = "hello";
		String ref3 = new String(ref1);

		System.out.println("ref1 == ref2 = " + (ref1 == ref2));
		System.out.println("ref2 == ref3 = " + (ref3 == ref2));

		String ref4 = ref1.intern();
		String ref5 = ref3.intern();

		System.out.println("ref4 == ref3 = " + (ref3 == ref4));
		System.out.println("ref4 == ref1 = " + (ref1 == ref4));
		System.out.println("ref4 == ref5 = " + (ref5 == ref4));
		System.out.println("ref3 == ref5 = " + (ref5 == ref3));
		
		String ref6 = new String("hello".intern());
		System.out.println("ref1 == ref6 = " + (ref1 == ref6));
	}
}
