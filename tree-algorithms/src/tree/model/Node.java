package tree.model;

public class Node {
	private Data data;
	private Node left;
	private Node right;
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	

}
