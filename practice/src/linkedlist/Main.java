package linkedlist;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addElement(10);
		// ll.traverse();
		ll.addElement(11);
		// ll.traverse();
		// System.out.println(ll.addElement(15).data);
		ll.addElement(15);
		System.out.println("----------------------------------");
		//System.out.println(ll.deleteElement(10).data);
		System.out.println("-----------------------------------");
		//ll.addElement(15);
		System.out.println(ll.deleteElement(11).data);
		ll.traverse();
	}
}
