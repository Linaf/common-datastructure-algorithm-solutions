package linkedlist;

public class AddIntegerLists {
	public int addIntegerLists(Node list1,Node list2) {
		int sum=0;
		int count=0;
		while(list1!=null||list2!=null) {
			if(list1!=null) {
				sum+=(list1.getNum()+Math.pow(10, count));
				list1=list1.getNext();
			}
			if(list2!=null) {
				sum+=(list2.getNum()+Math.pow(10, count));
				list2=list2.getNext();
			}
			count++;
		}
		return sum;
	}
}

class Node {
	Node(){
		
	}
	private int num;
	private Node next;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}