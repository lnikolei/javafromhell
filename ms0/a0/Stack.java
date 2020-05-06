package ms0.a0;

public class Stack {

	private Node top = null;
	private int length = 0;

	public Stack() {

	}

	public void push(String data) {
		Node temp = new Node(data);
		if (top == null) {
			top = temp;
		} else {
			temp.setNext(top);
			top = temp;
		}
		
		length++;
	}

	public String pop() {

		if (top == null) {
			
			return null;
		} else {
//			Node temp = top;								unwichtig?
			String data = top.getI();
			top = top.getNext();
//			temp = null;
			length--;
			return data;
		}
	}

	public String size() {
		return Integer.toString(length) ;

	}

	public String peek() {
		if(top == null) {
			
			return null;
		} else {
		
		return top.getI();
		}
	}

}
