package com.example.middleLinkedList;

import java.util.ArrayList;
import java.util.List;

public class MiddleLinkedList {

	public static void main(String[] args) {
		List<Node> list = new ArrayList<>();
		LikedList linkedList = new LikedList();
		linkedList.addNode(new Node("1"));
		linkedList.addNode(new Node("2"));
		linkedList.addNode(new Node("3"));
		linkedList.addNode(new Node("4"));
		linkedList.addNode(new Node("5"));

		Node head = linkedList.getHead();
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

		System.out.println("length of LinkedList: " + length);
		System.out.println("middle element of LinkedList : " + middle);

	}

}
