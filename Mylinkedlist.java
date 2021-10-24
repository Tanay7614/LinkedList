package sample2;

import java.util.Scanner;

public class Mylinkedlist {
     Node head;
     Node tail;
	
    public Mylinkedlist()
        {
	    this.head = null;
	    this.tail=null;
	}
	
    public void add(Node newNode)
     {
		 if(head==null) {
			head=newNode;
		 }
	    
		 if(tail==null)
		 {
			 tail=newNode;
	         }
	    
	        else
		{
	    	Node temp = head;
	    	head=newNode;
	    	head.next=temp;
	    	
	     } 
     }
     
     public void append(Node newNode) 
     {
    	 if(head==null && tail==null) 
    	        {
		     head=newNode;
	             tail=newNode;
	        }
	    
	     else
	     {
	    	
	    	 Node temp=newNode;
	    	 tail.next=newNode;
	    	 tail=temp;
	     }
     }
    
     public void insertBetween()
     { 
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println(" Enter node element after that you want to insert your new element");
    	 int key=sc.nextInt();
    	 int res= search(key);
    	 if(res==1)
	 {
    		 Node temp=head;
    		 Node p=temp.next;
    		 System.out.println(" Enter your element to insert");
    		 int val=sc.nextInt();
    		 Node node=new Node(val);
    		 
    		 while(temp.next!=null) 
    		 {
    			 if(temp.data==key)
			 {
    				 temp.next=node;
    				 node.next=p;
    				 break;
    			 }
    			 p=p.next;
    			 temp=temp.next;
    			 
    		 }
    	 }
    	 else
	 {
    		 System.out.println(" element is not present");
    	 }
    }
     
     public void delete(Node first) 
     {
 	   Node temp=head;
 	   head=temp.next;
     }
     
     public void deleteLast()
     {
 	Node temp=head;
 	tail=temp.next;
     }
     
     public int search( int key) {
    	 Node temp=head;
    	 int flag=0;
    	 while(true) {
    	 while(temp.next!=null)
	 {
    		 if(temp.data==key)
		 {
    			 System.out.println("value "+key+" is present");
    			 flag=1;
    		 }
    	    temp=temp.next;
         }
    	 if(temp.data==key)
	 {
    		 System.out.println("value "+key+" is present"); 
    		 flag=1;
    	 }
    	 break;
    	 }
		return flag;
    	
     }
	
     public void print()
     {
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
			
	 }

  }
     

