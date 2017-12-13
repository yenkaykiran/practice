package yuown.java.patterns;

public class FactoryDemo {
	public static void main(String[] args) {
		Shape obj1 = AbstractFactory.getShape(1);
		Shape obj2 = AbstractFactory.getShape(2);

		obj1.draw();
		obj2.draw();
	}

}

interface IAbstractFactory {
	
}

class AbstractFactory {
	public static Shape getShape(int i) {
		Shape obj = null;
		switch (i) {
		case 1:
			obj = new Square();
			break;
		case 2:
			obj = new Circle();
			break;
		}
		return obj;
	}

	public static Color getColor(int i) {
		Color obj = null;
		switch (i) {
		case 1:
			obj = new Green();
			break;
		case 2:
			obj = new Red();
			break;
		}
		return obj;
	}
}

interface Shape {
	public void draw();
}

interface Color {
	public void fill();
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square");
	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}

class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Green");
	}

}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Red");
	}

}
