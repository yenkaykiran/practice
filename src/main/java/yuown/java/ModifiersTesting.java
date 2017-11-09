package yuown.java;

public class ModifiersTesting {

	public static void main(String[] args) {
		class One {
			public void test1() {
				System.out.println("Test1");
			}

			@Override
			protected void finalize() throws Throwable {
				System.out.println("Finalize");
				super.finalize();
			}
		}

		One one = new One();
		one.test1();
		one = null;
		System.gc();
	}
}