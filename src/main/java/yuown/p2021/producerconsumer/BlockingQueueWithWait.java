package yuown.p2021.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Not working
 * 
 * @author k3n
 *
 * @param <E> Generic Type
 */
public class BlockingQueueWithWait<E> {

	private Queue<E> q;

	private int capacity;

	public BlockingQueueWithWait(int capacity) {
		this.capacity = capacity;
		q = new LinkedList<E>();
	}

	public synchronized void put(E item) throws InterruptedException {
		try {
			while (q.size() == capacity) {
				q.wait();
			}
		} finally {
			q.notifyAll();
		}
	}

	public synchronized E take() throws InterruptedException {
		try {
			while (q.size() == 0) {
				q.wait();
			}
			E item = q.remove();
			return item;
		} finally {
			q.notifyAll();
		}
	}
}
