package yuown.java.patterns;

public class DecoratorDemo {
	public static void main(String[] args) {
		Car sports = new SportsCar(new Basic());
		sports.assemble();

		System.out.println();

		Car sLC = new LuxuryCar(new SportsCar(new Basic()));
		sLC.assemble();
	}
}

interface Car {
	public void assemble();
}

class Basic implements Car {
	@Override
	public void assemble() {
		System.out.println("Basic");
	}
}

abstract class CarDecorator implements Car {
	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		car.assemble();
	}
}

class SportsCar extends CarDecorator {
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Sports Feature Added");
	}
}

class LuxuryCar extends CarDecorator {
	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Luxury Feature Added");
	}
}
