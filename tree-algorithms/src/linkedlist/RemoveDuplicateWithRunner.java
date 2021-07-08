package linkedlist;

import tree.model.Node;

public class RemoveDuplicateWithRunner {
	
	public static void removeDuplicateWithRunner(Node head) {
		if(head==null || head.getNext()==null)
			return;
		Node current= head;
		while(current!=null) {
			Node temp1=current.getNext(),temp2=current;
			while(temp1!=null) {
		    	
				if(temp1==current) {
		    		 temp2.setNext(temp1.getNext());
		    		 temp1=temp1.getNext();
		    		 if(temp1==null)
		    			 break;
		    		}
				temp1=temp1.getNext();
				temp2=temp2.getNext();
		     }
			current=current.getNext();
		}
		
}
}
