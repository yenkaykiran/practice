package yuown.java;

public class TestAbstract {
	public static void main(String[] args) {
		Abs abs = new Abs() {

			@Override
			public void hello() {
				System.out.println("Hello!");
			}

		};
		System.out.println("One: " + abs.one());
		abs.hello();
	}
}

interface Iface {
	void hello();
}

abstract class Abs implements Iface {
	public int one() {
		return 1;
	}

	private void hidden() {
		System.out.println("I'm hidden");
	}
}
