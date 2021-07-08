package linkedlist;

public class DetectLoop {
	public static Node detectLoop(Node head) {
		
		Node temp1=head;
		Node temp2=head;
		while(temp1!=null || temp2!=null) {
			temp1=temp1.getNext();
			temp2=temp2.getNext()==null?null:temp2.getNext().getNext();
			if(temp1!=null&&temp2!=null)
				if(temp1==temp2)
					return temp1;
		}
		return null;
	}

}
