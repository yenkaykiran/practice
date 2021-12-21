package yuown.p2021.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Working
 * 
 * @author k3n
 *
 * @param <E> Generic Type
 */
public class BlockingQueueWithLock<E> {

	private Queue<E> q;

	private int capacity;

	private ReentrantLock lock = new ReentrantLock(true);

	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();

	public BlockingQueueWithLock(int capacity) {
		this.capacity = capacity;
		q = new LinkedList<>();
	}

	public void put(E item) throws InterruptedException {
		lock.lock();
		try {
			if (q.size() == capacity) {
				notFull.await();
			}
			q.add(item);
			notEmpty.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public E take() throws InterruptedException {
		lock.lock();
		try {
			while (q.size() == 0) {
				notEmpty.await();
			}
			E item = q.remove();
			notFull.signalAll();
			return item;
		} finally {
			lock.unlock();
		}
	}
}
