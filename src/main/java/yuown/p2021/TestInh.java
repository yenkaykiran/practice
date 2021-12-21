package yuown.p2021;

public class TestInh {
	public static void main(String[] args) {
		(new BaseC()).method();
	}
}

interface BaseI {
	void method();
}

class BaseB {
	void method() {
		System.out.println("BaseB");
	}
}

class BaseC extends BaseB implements BaseI {

	@Override
	public void method() {
		System.out.println("BaseC");
	}
}