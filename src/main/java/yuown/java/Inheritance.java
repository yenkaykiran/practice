package yuown.java;

public class Inheritance {
	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.display();
	}
}

class Super {

	public Super() {
		System.out.println("Parent Constructor");
	}
	
	public Super(int o) {
		System.out.println("Parent Constructor1");
	}

	public void display() {
		System.out.println("In Parent");
	}
}

class Sub extends Super {

	public Sub() {
		System.out.println("Child Constructor");
	}

	@Override
	public void display() {
		System.out.println("In Child");
	}
}