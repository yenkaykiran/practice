package yuown.p2021.walmart;

import java.util.Stack;

public class QueueWithStack {
	
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	
	private int entry;

	public static void main(String[] args) {
		
	}
	
	
	public void add(int d) {
		entry = d;
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s2.push(d);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public int front() {
		return entry;
	}
	
	public void remove() {
		s1.pop();
		if(!s1.isEmpty()) {
			entry = s1.peek();
		}
	}
	
	public boolean isEmpty() {
		return s1.isEmpty();
	}
}
