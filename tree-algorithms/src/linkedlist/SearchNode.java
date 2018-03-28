package linkedlist;

import tree.model.Node;

public class SearchNode {
	
	public static Node searchNodeByData(Node head, String key) {
		Node temp=head;
		while(temp!=null) {
			if(temp.getData()!=null)
				if(temp.getData().getKey()==key)
					return temp;
			temp=temp.getNext();
		}
		
		return null;
	}

}
