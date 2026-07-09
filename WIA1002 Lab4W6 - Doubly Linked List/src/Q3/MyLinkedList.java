package Q3;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public int getSize() { return size; }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, head, null);
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = newNode;
        size++;
        System.out.println("adding: " + e);
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null, tail);
        if (tail != null) tail.next = newNode;
        tail = newNode;
        if (head == null) head = newNode;
        size++;
        System.out.println("adding: " + e);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) current = current.next;
            Node<E> newNode = new Node<>(e, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
            System.out.println("adding: " + e);
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        Node<E> current = head;
        for (int i = 0; i < index; i++) current = current.next;

        if (current.prev != null) current.prev.next = current.next;
        else head = current.next;

        if (current.next != null) current.next.prev = current.prev;
        else tail = current.prev;

        size--;
        System.out.println("removed: " + current.element);
        return current.element;
    }

    public void iterateForward() {
        System.out.print("iterating forward: ");
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + (current.next != null ? ", " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public void iterateBackward() {
        System.out.print("iterating backward: ");
        Node<E> current = tail;
        while (current != null) {
            System.out.print(current.element + (current.prev != null ? ", " : ""));
            current = current.prev;
        }
        System.out.println();
    }

    public void clear() {
        head = tail = null;
        int oldSize = size;
        size = 0;
        System.out.println("successfully clear " + oldSize + " nodes.");
    }
}