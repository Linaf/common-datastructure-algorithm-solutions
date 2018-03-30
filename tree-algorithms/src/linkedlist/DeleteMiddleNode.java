package linkedlist;

import tree.model.Node;

public class DeleteMiddleNode {
	
	public static boolean deleteMiddleNode( Node input) {
		if(input==null || input.getNext()==null)
			return false;
		input.setData(input.getNext().getData());
		input.setNext(input.getNext().getNext());
		return true;
	}

}
