package Lab3;

public class Node<E> {
    // Instance variables
    public E element;      
    public Node<E> next;   

    public Node() {
        this(null);
    }

    public Node(E e) {
        this.element = e;
        this.next = null;
    }
    
//    // Assessor
//    public E getElement() {
//        return element;
//    }
//
//    public Node<E> getNext() {
//        return next;
//    }
//
//    // Mutator
//    public void setElement(E e) {
//        this.element = e;
//    }
//
//    public void setNext(Node<E> n) {
//        this.next = n;
//    }
}