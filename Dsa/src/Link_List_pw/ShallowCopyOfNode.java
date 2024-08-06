package Link_List_pw;


public class ShallowCopyOfNode {

	public static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;

		}
	}

	public static void diplayRecursive(Node head) {

		if (head == null) {
			return;
		}

		System.out.println(head.val);
		diplayRecursive(head.next);

	}

	

	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);

		node1.next = node2;
		node2.next = node3;
		Node temp = node1;
		/*
		 * System.out.println(temp.val);
		 * 
		 * temp=temp.next; System.out.println(temp.val);
		 * 
		 * temp=temp.next; System.out.println(temp.val);
		 */

		// print(node1);

		diplayRecursive(node1);

	}
}
