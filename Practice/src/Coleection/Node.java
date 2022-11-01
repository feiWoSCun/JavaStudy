package Coleection;

public class Node {
    public Node getNext() {
        return next;
    }

    private  Node next;
    private Object date;

    public Node(Node next, Object date) {
        this.next = next;
        this.date = date;
    }

    public Node setNext(Node next) {
        this.next = next;
        return next;
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
