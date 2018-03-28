package linkedlist;

import tree.model.Node;

public class DeleteNode {
  public static void deleteNode(Node head, String key) {
		Node temp =head;
		if(temp!=null && temp.getData().getKey()==key) {
			temp=temp.getNext();
			return;
		}
	  while(temp!=null) {
			if(temp.getData()!=null && temp.getData().getKey()==key) {
				temp=temp.getNext();
				return;
			}
			temp=temp.getNext();
			
		}
	
  }
}
