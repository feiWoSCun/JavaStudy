package Coleection;

public class LinkedList {
    Node header;

    public boolean add(Object obj) {
        if (header == null) {
            header = new Node(null, obj);
            return true;
        } else {
            Node currentNode = findLast(header);
            currentNode.setNext(new Node(null, obj));
            return true;
        }
    }

    private Node findLast(Node node) {
        if (node.getNext() == null) {
            return node;
        } else
            return findLast(node.getNext());
    }

    private void toString(Node node) {
        System.out.println(node.toString());
        if (node.getNext() != null) {
            toString(node.getNext());
        } else return;
        ;
    }

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add(2);
        link.add(3);
        link.add(4);
        link.add("sidc");
        link.add(123);
        link.toString(link.header);
    }
}
