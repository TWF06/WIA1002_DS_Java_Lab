package SList;

public class SNode<E> {
    E element;
    SNode<E> next;

    public SNode() {
        this.element = null;
        this.next = null;
    }

    public SNode(E e) {
        this.element = e;
        this.next = null;
    }
}