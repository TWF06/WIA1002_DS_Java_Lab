package Queue;

import java.util.LinkedList;

public class MyQueue<E> {
    // Internal storage using LinkedList as per instructions
    private LinkedList<E> list = new LinkedList<>();

    // b. Default constructor
    public MyQueue() {
    }

    // a. Constructor that initializes the queue with an array of elements
    public MyQueue(E[] e) {
        for (E item : e) {
            enqueue(item);
        }
    }

    // c. Adds an element to the rear of the queue (Standard operation) 
    public void enqueue(E e) {
        list.addLast(e);
    }

    // d. Removes and returns the element from the front (Standard operation) 
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    // e. Returns the element at a specific index without removing it
    public E getElement(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        return list.get(i);
    }

    // f. Returns the element at the front without removing it 
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    // g. Returns the number of elements in the queue 
    public int getSize() {
        return list.size();
    }

    // h. Checks if a specific element exists in the queue 
    public boolean contains(E e) {
        return list.contains(e);
    }

    // i. Checks if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // j. Returns a string representation of the queue
    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}