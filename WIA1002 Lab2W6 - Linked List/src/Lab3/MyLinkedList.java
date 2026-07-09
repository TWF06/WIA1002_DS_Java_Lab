package Lab3;

public class MyLinkedList<E>{
    // instance variable
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    //default constructor
    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    //add first
    public void addFirst(E e){
        Node<E> a = new Node<E>(e);
        a.next = head;
        head = a;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    
    //add last
    public void addLast(E e) {
        Node<E> z = new Node<E>(e);
        if (size == 0) {
            head = tail = z;
        } else {
            tail.next = z;
            tail = z;
        }
        size++;
    }
    
    //add at index
    public void add(int index, E e){
        if (index < 0 || index > size) return;
        if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<E> newest = new Node<>(e);
            newest.next = temp.next;
            temp.next = newest;
            size++;
        }
    }
    
    //remove first
    public E removeFirst() {
        if (size == 0) return null;
        E element = head.element;
        head = head.next;
        size--;
        if (size == 0) tail = null;
        return element;
    }
    
    //remove last
    public E removeLast() {
        if (size == 0) return null;
        E element = tail.element;
        if (size == 1) {
            head = tail = null;
        } else {
            Node<E> temp = head;
            // Stop at the second-to-last node
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
        return element;
    }
    
    //remove at index
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        E element = temp.next.element;
        temp.next = temp.next.next;
        size--;
        return element;
    }
    
    // contains(E e)
    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    // get(int index)
    public E get(int index) {
        if (index < 0 || index >= size) return null;
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    // getFirst()
    public E getFirst() {
        return (head == null) ? null : head.element;
    }

    // getLast()
    public E getLast() {
        return (tail == null) ? null : tail.element;
    }

    // indexOf(E e)
    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) return i;
            current = current.next;
        }
        return -1;
    }

    // lastIndexOf(E e)
    public int lastIndexOf(E e) {
        int lastIndex = -1;
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) lastIndex = i;
            current = current.next;
        }
        return lastIndex;
    }

    // set(int index, E e)
    public E set(int index, E e) {
        if (index < 0 || index >= size) return null;
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E oldElement = current.element;
        current.element = e;
        return oldElement;
    }

    // clear()
    public void clear() {
        head = tail = null;
        size = 0;
    }

    // print()
    public void print() {
        Node<E> current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.element + (current.next != null ? ", " : ""));
            current = current.next;
        }
        System.out.println("]");
    }

    // reverse() - Printing in reverse order using recursion
    public void reverse() {
        reverseHelper(head);
        System.out.println();
    }

    private void reverseHelper(Node<E> node) {
        if (node == null) return;
        reverseHelper(node.next); // Go to the end first
        System.out.print(node.element + " "); // Print on the way back up the stack
    }
    
    //Q2
    public E getMiddleValue() {
        if (size == 0) return null;
    
        Node<E> temp = head;
        for (int i = 0; i < size / 2; i++) {
            temp = temp.next;
        }
        return temp.element;
    }
    
    public E getMiddleValue2() {
        if (head == null) return null;

        Node<E> slow = head;
        Node<E> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.element;
    }
    
    //getter
    public int getSize() {
        return size;
    }
}
