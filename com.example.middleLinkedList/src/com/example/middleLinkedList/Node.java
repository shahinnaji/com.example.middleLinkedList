package com.example.middleLinkedList;

public final class Node {

	String value;
	Node next;

	public Node(String value, Node next) {
		this.value = value;
		this.next = next;
	}

	public Node(String value) {
		this(value, null);
	}

	/*
	 * Insert new node after this.
	 */
	public void insertAfter(String item) {
		next = new Node(item, next);
	}

	public Node nth(int position) {
		if (position == 1) {
			return this;
		} else if ((position < 1) || (next == null)) {
			return null;
		} else {
			return next.nth(position - 1);
		}
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}
