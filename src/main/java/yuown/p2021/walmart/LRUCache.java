package yuown.p2021.walmart;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	class Node {
		private int key;
		private int value;
		Node prev;
		Node next;
		
		@Override
		public String toString() {
			return key + "";
		}
	}
	
	private int capacity, size;
	
	private Map<Integer, Node> cache = new HashMap<>();
	
	private Node head, tail;
	
	public LRUCache(int capacity) {
		size = 0;
		this.capacity = capacity;
		
		head = new Node();
		tail = new Node();
		
		head.next = tail;
		tail.prev = head;
	}
	
	public void put(int key, int value) {
		Node n = cache.get(key);
		
		if(null == n) {
			n = new Node();
			n.key = key;
			n.value = value;
			size++;
			
			addNode(n);
			cache.put(key, n);
			if(size > capacity) {
				Node t = popTail();
				cache.remove(t.key);
				size--;
			}
		} else {
			n.value = value;
			moveToHead(n);
		}
	}
	
	public int get(int key) {
		Node n = cache.get(key);
		if(null == n) {
			return -1;
		}
		moveToHead(n);
		return n.value;
	}

	
	private void addNode(Node node) {
		node.prev = head;
		node.next = head.next;
		
		head.next.prev = node;
		head.next = node;
		
	}
	
	private void removeNode(Node node) {
		Node next = node.next;
		Node prev = node.prev;
		
		prev.next = next;
		next.prev = prev;
	}
	
	private void moveToHead(Node node) {
		removeNode(node);
		addNode(node);
	}
	
	private Node popTail() {
		Node n = tail.prev;
		removeNode(n);
		return n;
	}
	
	@Override
	public String toString() {
		return cache.toString();
	}
}
