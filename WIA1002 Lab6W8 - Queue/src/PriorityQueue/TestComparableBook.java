import java.util.PriorityQueue;
import java.util.Queue;

public class TestComparableBook {
    public static void main(String[] args) {
        // Queue initialized using natural ordering from ComparableBook
        Queue<ComparableBook> BookQueue = new PriorityQueue<>();

        // Adding books to the queue
        BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
        BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));

        // Display the queue as a whole
        System.out.println("Current Queue: " + BookQueue);

        // Retrieve and remove elements until empty
        while (BookQueue.peek() != null) {
            System.out.println("Head Element: " + BookQueue.peek());
            BookQueue.remove(); // Removes the smallest ID first
        }
    }
}