package Coleection;

public class DoubleLinkedList {

    MyNode first;
    MyNode last;

    public DoubleLinkedList() {
    }

    public boolean isAdd(Object o) {
        //声明最后一个节点给Node；
        MyNode node = last;
        //为每一个节点赋值
        MyNode helpNode = new MyNode(node, o, null);
        //把最新的帮助节点赋值给最后一个节点last;此时node任然是null；
        last = helpNode;
        //进行判断，使节点彼此连接
        if (node == null) {
            //如果第一个节点是空，则证明这是一个头节点
            first = helpNode;
        } else {
            //让helpNode赋值给最后一个节点的next节点
            node.next = helpNode;
        }
        return true;
    }

    public boolean toString(DoubleLinkedList l, MyNode node) {
        System.out.println(node.o.toString());
        if (node.next != null) {
            return toString(l, node.next);
        } else
            return true;

    }

    public boolean cOut(DoubleLinkedList d) {
        MyNode node = d.first;
        toString(d, node);
        return true;
    }

    public static class MyNode {
        MyNode previous;
        MyNode next;
        Object o;

        public MyNode(MyNode previous, Object o, MyNode next) {
            this.next = next;
            this.previous = previous;
            this.o = o;
        }
    }
}
