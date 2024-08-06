package Link_List_pw;

class SLL { // user defined data structure
	Node head;
	Node tail;
	int size;

	public void insertAtEnd(int val) {
   
          //case -1 when ll is emplty
		Node temp = new Node(val);
		size++;
		if(head==null) {
			head=tail=temp;
		}else {//case-2 LL is not empty
			tail.next = temp;
			tail=temp;
			
		}
	}
	
	public void insertAtHead(int val) {
		   
        //case -1 when ll is emplty
		Node temp = new Node(val);
		size++;
		if(head==null) {
			head=tail=temp;
		}else {//case-2 LL is not empty
			head.next = temp;
			head=temp;
			
		}
	}
	
	 public void display() {
	    	Node temp=head;
	    	while(temp!=null) {
	    		System.out.println(temp.val);
	    		temp=temp.next;
	    	}
	    	System.out.println();
	    }
	 
	 void insert(int idx ,int val) {
		 
		 if(idx == 0) {
			 insertAtHead(val);
			 return;
		 }
		 
			/*
			 * if(idx == size) { insertAtTail(val); return; }
			 */
		 
		 if(idx >size) {
			 System.out.println("Invalid Index....");
			 return;
		 }
		 
		 //create a node first
		 Node temp = new Node(val);
		 Node x =head;
		 //code for traversing
		 for(int i=0;i<idx-1;i++) {
			 x = x.next;
		 }
		 
		 //this is insertion code
		 temp.next=x.next;
		 x.next=temp;
		 size++;
	 }
	 
	 int get(int idx) throws Error {
		 if(idx == size-1)  {
			 return tail.val;
		 }
		 if(idx >=size || idx<0) {
			 System.out.println("Invalid Index");
			 throw new Error("Invalid index--------");
			// return -1;
			 
		 }
		 Node temp=head;
		 for(int i=0;i<=idx;i++) {
			 temp=temp.next;
		 }
		 return temp.val;
	 }
	 
}

public class ImplementationLL {
	public static void main(String[] args) {

		SLL list = new SLL();
		list.insertAtEnd(10);
		System.out.println(list.size);
		list.insertAtEnd(20);
		System.out.println(list.size);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		System.out.println(list.size);
		
		list.display();
		list.insertAtEnd(90);
		System.out.println(list.size);
		list.display();
		list.insert(2, 89);
		list.display();
		list.display();
		System.out.println("Index get");

		System.out.println(list.get(3));

		System.out.println(list.get(0));

		
	}
}
