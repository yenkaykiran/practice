package yuown.java;

public class ExceptionTest {
	public static void main(String[] args) {
		Test t = new Test();
		t.print(2);
	}
}

class Test {
	public void print(int n) throws Throwable {
		System.out.println("n = " + n);
	}
}
