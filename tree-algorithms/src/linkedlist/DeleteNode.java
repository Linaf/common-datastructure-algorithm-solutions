package linkedlist;

import tree.model.Node;

public class DeleteNode {
  public static void deleteNode(Node head, String key) {
		Node temp =head;
	  while(temp.getNext()!=null && temp.getNext().getData()!=null) {
			if(temp.getNext().getData().getKey() == key) {
				Node temp2=head.getNext();
				if(temp2.getNext().getData()==null) {
					temp.setNext(temp2.getNext());
				}
				
			
			}
				
			
		}
	
  }
}
