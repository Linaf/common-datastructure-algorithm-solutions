package linkedlist;

import tree.model.Node;

public class AddLast {
	Node head=null;
	public void add(Node node) {
		if(head==null) {
			head.setRight(node);
			return;
		}
		Node temp=head;
		while(temp.getRight()!=null) {
			temp=temp.getRight();
		}
		temp.setRight(node);
		return;
	}
}
