package sample2;



public class Mylink {
	
	 public void insert() {
		  
		 Node first=new Node(30);
		   Node second=new Node(56);
		   Node third=new Node(70);
		   Mylinkedlist list=new Mylinkedlist();
		   list.append(first);
		   list.append(third);
		   list.insertBetween(second);
		   list.delete(first);
		   list.print();
		   
	  }

}
