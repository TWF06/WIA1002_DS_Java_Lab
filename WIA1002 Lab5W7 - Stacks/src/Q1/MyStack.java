package Q1;

import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    // Push element
    public void push(E o) {
        list.add(o);
    }

    // Pop element
    public E pop() {
        if (isEmpty()) return null;
        return list.remove(list.size() - 1);
    }

    // Peek top element
    public E peek() {
        if (isEmpty()) return null;
        return list.get(list.size() - 1);
    }

    // Get size
    public int getSize() {
        return list.size();
    }

    // Check empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Search element
    public boolean search(E o) {
        return list.contains(o);
    }

    // Print stack
    @Override
    public String toString() {
        return list.toString();
    }
    
    public static int sumStack(MyStack<Integer> stack) {
        MyStack<Integer> temp = new MyStack<>();
        int sum = 0;
        while (!stack.isEmpty()) {
            int val = stack.pop();
            sum += val;
            temp.push(val);
        }
        // Restore stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return sum;
    }
    //Use temporary stack to preserve original stack
}
