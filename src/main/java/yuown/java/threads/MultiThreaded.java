package yuown.java.threads;

public class MultiThreaded {

	public static void main(String[] args) throws InterruptedException {
		ThreadTest t1 = new ThreadTest();
		t1.start();

		RunnableTest r1 = new RunnableTest();
		new Thread(r1).start();
		System.out.println("End of main");
	}

}

class ThreadTest extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("Started");
	}

}

class RunnableTest implements Runnable {

	@Override
	public void run() {
		System.out.println("Started Runnable");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}