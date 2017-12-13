package yuown.designpatterns;

import java.util.Arrays;

public class DecaratorPatternTest {

	public static void main(String[] args) {
		// Car sportsCar = new SportsCar(new BasicCar());
		// sportsCar.assemble();
		//
		// System.out.println("\n\n");
		//
		// Car luxuryCar = new LuxuryCar(sportsCar);
		// luxuryCar.assemble();

		System.out.println(Arrays.toString(oddNumbers(2, 5)));
	}

	static int[] oddNumbers(int l, int r) {
		if (l % 2 != 1) {
			l++;
		}
		if (r % 2 != 1) {
			r--;
		}
		int[] arr = new int[(r - l) / 2 + 1];
		System.out.println("Size: " + arr.length);
		for (int i = l, j = 0; i <= r && i % 2 == 1; i++, j++) {
			arr[j] = i;
		}
		return arr;
	}

}

interface Car {
	public void assemble();
}

class BasicCar implements Car {
	@Override
	public void assemble() {
		System.out.println("Basic Car");
	}
}

class CarDecarator implements Car {

	private Car car;

	public CarDecarator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		car.assemble();
	}
}

class SportsCar extends CarDecarator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Features of SprotsCar");
	}
}

class LuxuryCar extends CarDecarator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Features of LixuryCar");
	}
}