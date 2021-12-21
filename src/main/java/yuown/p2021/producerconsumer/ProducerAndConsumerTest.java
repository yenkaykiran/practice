package yuown.p2021.producerconsumer;

public class ProducerAndConsumerTest {

	static int task = 1;

	public static void main(String[] args) throws InterruptedException {
		BlockingQueueWithLock<Task> q = new BlockingQueueWithLock<>(10);
		// BlockingQueueWithWait<Task> q = new BlockingQueueWithWait<>(10);

		Runnable producer = () -> {
			while (true) {
				try {
					q.put(createItem());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(producer).start();
		new Thread(producer).start();

		Runnable consumer = () -> {
			while (true) {
				try {
					Task item = q.take();
					process(item);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(consumer).start();
		new Thread(consumer).start();

	}

	private static void process(Task item) {
		System.out.println("Processing " + item.name);
	}

	private static Task createItem() {
		Task item = new Task("Item", task++);
		System.out.println("Producing " + item.name);
		return item;
	}

}

class Task {
	String name;

	Task(String name, int n) {
		this.name = name + " " + n;
	}
}