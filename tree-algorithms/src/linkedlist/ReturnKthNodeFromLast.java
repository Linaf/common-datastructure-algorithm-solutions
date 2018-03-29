package linkedlist;

import tree.model.Node;

public class ReturnKthNodeFromLast {
	public static Node getKthElementFromLast(Node head,int k) {
		Node temp=head;
		int n=getSize(head);
		if(k>n || k<=0) 
			return null;
		for(int i=1;i<=(n-k);i++) {
			temp=temp.getNext();
		}
		return temp;
	}

	private static int getSize(Node head) {
		int size=0;
		Node temp=head;
		while(temp!=null) {
			size++;
			temp=temp.getNext();
		}
		return size;
	}
}
