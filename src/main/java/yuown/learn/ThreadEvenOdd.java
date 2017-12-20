package yuown.learn;

public class ThreadEvenOdd {

	public static void main(String[] args) {
		EvenPrinter e = new EvenPrinter(10);
		OddPrinter o = new OddPrinter(10);
		e.start();
		o.start();
	}

}

class EvenPrinter extends Thread {

	private int max;

	private int current = 1;

	EvenPrinter(int m) {
		max = m;
	}

	@Override
	public void run() {
		while (current <= max) {
			if (current % 2 == 0) {
				System.out.println(current);
			}
			current++;
		}
	}

}

class OddPrinter extends Thread {

	private int max;

	private int current = 1;

	OddPrinter(int m) {
		max = m;
	}

	@Override
	public void run() {
		while (current <= max) {
			if (current % 2 == 1) {
				System.out.println(current);
			}
			current++;
		}
	}
}

class Printer {
	
}