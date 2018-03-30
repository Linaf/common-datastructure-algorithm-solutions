package linkedlist;

import tree.model.Node;

public class ReturnKthNodeFromLastRecursive {
	public static Node returnKthNodeFromLastRecursive(Node head,int k) {
		NodeWrapper wrapper=new NodeWrapper(head,0);
		Node node=helper(wrapper,k);
		return node;
	}
	public static Node helper(NodeWrapper wrapper,int k) {
		if(wrapper.getNode()==null) {
			return null;
		}
		if(wrapper.getIndex()==k) {
			return wrapper.getNode();
		}
		wrapper.setIndex(wrapper.getIndex()+1);
		wrapper.setNode(wrapper.getNode().getNext());
		return helper(wrapper,k);
	}

}
 class NodeWrapper{
	private Node node;
	private int index;
	NodeWrapper(Node node,int index){
		this.node=node;
		this.index=index;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
}
