package ms0.a0;

public class Node {
    private String i;
    private Node next;

    public Node(String d) {
        i = d;
        next = null;
    }

    public String getI() {
        return i;
    }

    public void setI(String data) {
        this.i = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}