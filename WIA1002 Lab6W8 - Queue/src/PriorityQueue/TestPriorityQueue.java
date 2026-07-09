import java.util.Arrays;

public class TestPriorityQueue {
    public static void main(String[] args) {
        // 1. Initial array
        Integer[] numbers = {4, 8, 1, 2, 9, 6, 3, 7};
        MyPriorityQueue<Integer> myPQ = new MyPriorityQueue<>();

        // Insert integers into priority queue
        for (Integer n : numbers) {
            myPQ.add(n);
        }

        // toString() - Display all elements
        System.out.println("toString(): " + myPQ.toString());

        // poll() - retrieve and remove first element
        System.out.println("poll(): " + myPQ.poll());

        // add() - add new element 5
        myPQ.add(5);
        System.out.println("After adding 5: " + myPQ.toString());

        // toArray() - convert and display
        System.out.println("toArray(): " + Arrays.toString(myPQ.toArray()));

        // peek() - retrieve first element
        System.out.println("peek(): " + myPQ.peek());

        // contains() - check for element "1"
        System.out.println("contains(1): " + myPQ.contains(1));

        // size() - current size
        System.out.println("size(): " + myPQ.size());

        // isEmpty() - display while removing until empty
        System.out.print("isEmpty() loop: ");
        while (!myPQ.isEmpty()) {
            System.out.print(myPQ.poll() + " ");
        }
        System.out.println();

        // Sort the priority queue in reversing order
        System.out.println("\n--- Sorting in Reverse Order ---");
        MyPriorityQueue<Integer> reversePQ = new MyPriorityQueue<>(true);
        for (Integer n : numbers) {
            reversePQ.add(n);
        }
        System.out.print("Reverse order output: ");
        while (!reversePQ.isEmpty()) {
            System.out.print(reversePQ.poll() + " ");
        }
        System.out.println();
    }
}