package linkedlist;

public class SinglyLinkedList {

	Node head = null;

	public Node addElement(int data) {
		if (head == null) {
			head = new Node(data);
			return head;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
			return temp.next;
		}
	}

	public Node deleteElement(int data) {
		Node temp = head;
		Node deletedElement = null, prev = null;

		if (head == null)
			return null;

		if (temp.data == data) {
			deletedElement = temp;
			head = temp.next;
			deletedElement.next = null;
		}

		while (temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return null;

		deletedElement = prev.next;
		prev.next = temp.next;

		return deletedElement;
	}

	public void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
