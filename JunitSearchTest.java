package sample2;

import org.junit.jupiter.api.Test;

class JunitSearchTest {
	public final Mylinkedlist list1 = new Mylinkedlist();
	@Test
	void test() {
		
		   Node first=new Node(30);
		   Node second=new Node(56);
		   Node third=new Node(70);
		  
		   list1.append(first);
		   list1.append(second);
		   list1.append(third);
		 
		   list1.print();
		   list1.search(70);
		   
	}

}
