package linkedlist;

import tree.model.Node;
/*
This method will add node to the end
*/
public class AddLast {
	Node head=null;
	public void add(Node node) {
		if(head==null) {
			head.setNext(node);
			return;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(node);
		return;
	}
}
