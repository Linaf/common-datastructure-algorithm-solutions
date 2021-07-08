package tree.model;

public class Node {
	private Data<String> data;
	private Node next;
	public Data<String> getData() {
		return data;
	}
	public void setData(Data<String> data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}


}
