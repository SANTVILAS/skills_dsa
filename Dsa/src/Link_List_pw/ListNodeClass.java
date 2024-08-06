package Link_List_pw;



public class ListNodeClass {

	public static void main(String[] args) {

	Node node1 = new Node(10);
	Node node2 = new Node(20);
	Node node3 = new Node(30);
	
	
	node1.next = node2;
	node2.next=node3;
	
	System.out.println(node1.next);
	System.out.println(node2);
	
	System.out.println("===============");
	
	System.out.println(node2.next);
	System.out.println(node3);
	
	
	
	System.out.println(node1.val);
	System.out.println(node1.next);
	System.out.println(node2.next);
	System.out.println(node3.next);

	System.out.println(node2.val);
	System.out.println(node3.val);
	System.out.println(node1);
	System.out.println(node2);
	System.out.println(node3);
	
	System.out.println(node1.val);
	System.out.println(node1.next.val);
	System.out.println(node1.next.next.val);
	
	}
}
