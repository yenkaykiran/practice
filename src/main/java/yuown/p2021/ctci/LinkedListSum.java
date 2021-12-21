package yuown.p2021.ctci;

import yuown.model.LinkedListNode;

public class LinkedListSum {

	public static void main(String[] args) {
//		LinkedListNode num1 = new LinkedListNode(7);
//		num1.addToEnd(1);
//		num1.addToEnd(6);
//		
//		LinkedListNode num2 = new LinkedListNode(5);
//		num2.addToEnd(9);
//		num2.addToEnd(2);
//		
//		num1.printList();
//		num2.printList();
//		
//		LinkedListNode sum = addLists(num1, num2, 0);
//		sum.printList();
		LinkedListNode head = new LinkedListNode(1);
		head.addToEnd(2);
		head.addToEnd(4);
		head.addToEnd(5);
		
		LinkedListNode rev = head.reverseAndClone();
		head.printList();
		rev.printList();
		
		System.out.println("Equals = " + head.equals(rev));
	}
	
	private static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
		if(l1 == null && l2 == null && carry == 0) {
			return null;
		}
		int value = carry;
		if(l1 != null) {
			value += l1.getData();
		}
		if(l2 != null) {
			value += l2.getData();
		}
		LinkedListNode result = new LinkedListNode(value);
		result.setData(value % 10);
		if(l1 != null || l2 != null) {
			LinkedListNode more = addLists(l1 == null ? null : l1.getNext(), l2 == null ? null : l2.getNext(), value > 10 ? 1 : 0);
			result.setNext(more);
		}
		return result;
	}
}
