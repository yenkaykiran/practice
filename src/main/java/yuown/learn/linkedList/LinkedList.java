package yuown.learn.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

	private SingleLinkedNode head;

	public void insertAtHead(Object data) {
		SingleLinkedNode newNode = new SingleLinkedNode(data);
		newNode.setNextNode(head);
		head = newNode;
	}

	public void removeHead() {
		if (head != null) {
			head = head.getNextNode();
		}
	}

	public boolean search(Object data) {
		boolean flag = false;
		SingleLinkedNode current = head;
		while (null != current) {
			if (current.getData() == data) {
				flag = true;
				break;
			}
			current = current.getNextNode();
		}
		return flag;
	}

	public SingleLinkedNode insertAsSorted(int data) {
		SingleLinkedNode newNode = new SingleLinkedNode(data);
		if (head == null || (Integer) head.getData() >= data) {
			newNode.setNextNode(head);
			head = newNode;
		} else {
			SingleLinkedNode current = head;
			while (current.getNextNode() != null && (Integer) current.getNextNode().getData() < data) {
				current = current.getNextNode();
			}
			newNode.setNextNode(current.getNextNode());
			current.setNextNode(newNode);
		}
		return newNode;
	}

	public SingleLinkedNode insertAtEnd(int data) {
		SingleLinkedNode newNode = new SingleLinkedNode(data);
		if (head == null) {
			head = newNode;
		} else {
			SingleLinkedNode current = head;
			while (current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
		}
		return newNode;
	}

	public void reverse() {
		SingleLinkedNode prev = null, next = null;
		SingleLinkedNode current = head;
		while (current != null) {
			next = current.getNextNode();
			current.setNextNode(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void removeDuplicates() {
		SingleLinkedNode current = head;
		SingleLinkedNode prev = null;
		Set<Integer> items = new HashSet<Integer>();
		while (null != current) {
			if (items.contains(current.getData())) {
				prev.setNextNode(current.getNextNode());
			} else {
				items.add((Integer) current.getData());
				prev = current;
			}
			current = current.getNextNode();
		}
	}

	public void removeDuplicatesWithoutExtraMemory() {
		SingleLinkedNode current = head;
		SingleLinkedNode runner = null;
		while (null != current) {
			runner = current;
			while (null != runner.getNextNode()) {
				if (runner.getNextNode().getData() == current.getData()) {
					runner.setNextNode(runner.getNextNode().getNextNode());
				} else {
					runner = runner.getNextNode();
				}
			}
			current = current.getNextNode();
		}
	}

	public void removeNode(SingleLinkedNode node) {
		if (null != node && node.getNextNode() != null) {
			node.setData(node.getNextNode().getData());
			node.setNextNode(node.getNextNode().getNextNode());
		}
	}

	/**
	 * Not Working Yet
	 */
	public boolean isCyclic() {
		boolean flag = false;
		if (head == null || head.getNextNode() == null) {
			flag = false;
		}
		SingleLinkedNode slow = head;
		SingleLinkedNode fast = head.getNextNode();
		while (true) {
			if (fast == null || fast.getNextNode() == null) {
				flag = false;
			}
			if (fast.equals(slow) || fast.getNextNode().equals(slow)) {
				flag = true;
				break;
			}
			slow = slow.getNextNode();
			fast = fast.getNextNode().getNextNode();
		}
		return flag;
	}

	@Override
	public String toString() {
		String result = "{";
		SingleLinkedNode current = head;
		while (current != null) {
			result += current.toString();
			current = current.getNextNode();
			if (current != null) {
				result += ", ";
			}
		}
		result += "}";
		return result;
	}

	public int length() {
		int length = 0;
		SingleLinkedNode current = head;
		while (current != null) {
			current = current.getNextNode();
			length++;
		}
		return length;
	}

	public Object kThFromLast(int k) {
		SingleLinkedNode p1 = head;
		SingleLinkedNode p2 = head;
		for (int i = 0; i < k; i++) {
			if(null == p1) {
				return null;
			}
			p1 = p1.getNextNode();
		}
		while(p1 != null) {
			p1 = p1.getNextNode();
			p2 = p2.getNextNode();
		}
		return p2.getData();
	}
}
