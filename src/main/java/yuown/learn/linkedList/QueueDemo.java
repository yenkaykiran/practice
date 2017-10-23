package yuown.learn.linkedList;

public class QueueDemo {

	public static void main(String[] args) {
		QueueWithLinkedList queue = new QueueWithLinkedList();
		queue.enqueue(2);
		queue.enqueue(1);
		queue.enqueue(20);
		queue.enqueue(13);
		queue.enqueue(21);
		queue.enqueue(6);
		queue.enqueue(7);

		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);

		// System.out.println("Dequeued: " + queue.dequeue());
		// System.out.println("Queue: " + queue);
		//
		// System.out.println("Dequeued: " + queue.dequeue());
		// System.out.println("Queue: " + queue);

		queue.enqueue(25);
		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue: " + queue);
	}
}
