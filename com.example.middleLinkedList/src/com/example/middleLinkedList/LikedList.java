package com.example.middleLinkedList;

public class LikedList {

	private Node head;
	private int size;

	public LikedList() {
		head = null;
		size = 0;
	}

	Node getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}

	public void insertFront(String item) {
		head = new Node(item, head);
		size++;
	}
}
