package sample2;

public class Mylinkedlist {
     Node head;
     Node tail;
	
     public Mylinkedlist() {
		
		this.head = null;
		this.tail=null;
	}
	
     public void add(Node newNode) {
		 if(head==null) {
			   head=newNode;
			  
		 }
	     if(tail==null) {
			 tail=newNode;
	     }
	     else {
	    	Node temp = head;
	    	head=newNode;
	    	head.next=temp;
	    	System.out.println(temp.data);
	    	
	     } 
  }
	
     public void print() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.getNext();
		}
			
	}
		
}
     

