package linkedlist;

import tree.model.Node;

public class RemoveDuplicateWithRunner {

	
	public static void removeDuplicateWithRunner(Node head) {
		if(head==null || head.getNext()==null)
			return;
		//{1,3,2,4,1,2,9}	
		//{1,5,2,2,2}
		Node current= head;
		while(current!=null) {
			for(Node tmp=current.getNext(),previous=current; tmp!=null;tmp=tmp.getNext(),previous=previous.getNext()) {
		    	
				if(tmp==current) {
		    		 previous.setNext(tmp.getNext());
		    		 
		    	 }
		     }
			current=current.getNext();
		}
		
}
}
