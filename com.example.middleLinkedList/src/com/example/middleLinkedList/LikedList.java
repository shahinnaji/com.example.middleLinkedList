package com.example.middleLinkedList;

public class LikedList {

	private Node head;
	private Node tail;

	public LikedList(String value) {
		head = new Node(value);
		tail = head;
	}

	public LikedList() {
		head = new Node("Head");
		tail = head;
	}

	Node getHead() {
		return head;
	}

	void addNode(Node node) {
		tail.next = node;
		tail = node;
	}
}
