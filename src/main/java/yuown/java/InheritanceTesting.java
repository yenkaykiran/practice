package yuown.java;

public class InheritanceTesting {
	public static void main(String[] args) {
		ImplementInterface test = new ImplementInterface();
		test.test1();
	}
}

class ImplementInterface extends AbstractClass implements Interface1, Interface2 {
	public void test1() {
		System.out.println("Test");
	}
}

interface Interface1 {
	public void test1();
}

interface Interface2 extends Interface1 {
	public void test1();
}

abstract class AbstractClass {
	public abstract void test1();
}