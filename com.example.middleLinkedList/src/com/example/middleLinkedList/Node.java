package com.example.middleLinkedList;

public final class Node {
	
	String value;
	Node next;
	
	public Node(String value, Node next) {
		this.value = value;
		this.next = next;
	}
	
	public Node(String value) {
		this.value = value;
		this.next = null;
	}
	
	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}
