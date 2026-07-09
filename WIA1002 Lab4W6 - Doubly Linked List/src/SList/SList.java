package SList;

public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size = 0;
    
    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public E removeInitial() {
        if (size == 0) return null;
        E temp = head.element;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return temp;
    }

    public boolean contains(E e) {
        SNode<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("The list is empty.");
    }

    public void display() {
        SNode<E> current = head;
        while (current != null) {
            System.out.print(current.element + (current.next != null ? ", " : ""));
            current = current.next;
        }
        System.out.println();
    }
}