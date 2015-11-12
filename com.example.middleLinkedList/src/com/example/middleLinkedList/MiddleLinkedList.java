package com.example.middleLinkedList;

public class MiddleLinkedList {

	public static void main(String[] args) {
		LikedList sList = new LikedList();
		sList.insertFront("1");
		sList.insertFront("2");
		sList.insertFront("3");
		sList.insertFront("4");
		sList.insertFront("5");
		sList.insertFront("6");

		Node head = sList.getHead();
		Node current = head;
		Node middle = head;
		int length = 0;

		while (current.next != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next;
			}
			current = current.next;
		}

		if (length % 2 == 1) {
			middle = middle.next;
		}

		System.out.println("Size of sList: " + sList.getSize());
		System.out.println("Middle element of sList: " + middle);
		System.out.println("nth node in the sList: " + sList.getHead().nth(3));

	}

}
