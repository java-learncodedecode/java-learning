package com.dev.singlylinkedlists;

public class SinglyLinkedList {

	private Node head;

	public boolean isEmpty() {
		return (head == null);
	}

	// Method for inserting node at the start of linked list
	public void insertAtFirst(int data) {
		Node newHead = new Node();
		newHead.data = data;
		newHead.next = head;
		head = newHead;
	}

	// function to insert node at the middle of the linked list
	public void insertAtMid(int data) {
		// if list is empty
		if (head == null)
			head = new Node(data);

		else {
			// get a new node
			Node newNode = new Node(data);

			// assign values to the slow and fast pointers
			Node slow = head;
			Node fast = head.next;

			while (fast != null && fast.next != null) {
				// move slow pointer to next node
				slow = slow.next;
				// move fast pointer two nodes at a time
				fast = fast.next.next;
			}

			// insert the 'newNode' and adjust the required links
			newNode.next = slow.next;
			slow.next = newNode;
		}
	}

	// Method used to insert at end of LinkedList
	public void insertAtLast(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	// Method for deleting node from start of linked list
	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}

	// Method used to delete node after provided node
	public void deleteAfterNode(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}

	// delete node from specified position
	void deleteNodeAtPosition(int position) {
		// If linked list is empty
		if (head == null)
			return;
		// Store head node
		Node temp = head;
		// If head needs to be removed
		if (position == 0) {
			head = temp.next; // Change head
			return;
		}
		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;
		// If position is more than number of nodes
		if (temp == null || temp.next == null)
			return;
		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Node next = temp.next.next;
		temp.next = next; // Unlink the deleted node from list
	}

	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertAtFirst(50);
		sll.insertAtFirst(60);
		sll.insertAtFirst(70);
		sll.insertAtFirst(10);
		sll.insertAtFirst(20);
		sll.printLinkedList();
		// Linked list will be
		// 10 -> 70 -> 60 -> 50 -> 20
		sll.insertAtLast(90);
		System.out.println("=========================");
		System.out.println("insert node after Node 50");
		System.out.println("=========================");
		sll.printLinkedList();

		sll.insertAtFirst(10);
		System.out.println("insert node at first");
		System.out.println("=========================");
		sll.printLinkedList();
		sll.insertAtMid(25);
		System.out.println("insert node at mid of sll");
		System.out.println("=========================");
		sll.printLinkedList();

		/*
		 * System.out.println("=========================");
		 * System.out.println("Delete node after Node 60");
		 * 
		 * Node node = new Node(); node.data = 60; sll.deleteFirst();
		 * sll.deleteAfterNode(node); // After deleting node after 1,Linked list will be
		 * // 10 -> 70 -> 60 -> 20
		 * 
		 * System.out.println("========================="); sll.printLinkedList();
		 */
		System.out.println("delete node by position");
		System.out.println("=========================");
		sll.deleteNodeAtPosition(8);
		sll.printLinkedList();
	}
}

class Node {
	public int data;
	public Node next;

	public Node() {
		super();
	}

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}
