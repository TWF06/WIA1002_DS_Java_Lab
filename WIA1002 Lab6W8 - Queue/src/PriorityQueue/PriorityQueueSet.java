import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.LinkedHashSet;
import java.util.Set;

public class PriorityQueueSet {
    public static void main(String[] args) {
        // Create the first priority queue 
        PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList(
            "George", "Jim", "John", "Blake", "Kevin", "Michael"
        ));

        // Create the second priority queue
        PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList(
            "George", "Katie", "Kevin", "Michelle", "Ryan"
        ));

        // 1. Find the Union (All unique elements from both)
        PriorityQueue<String> union = new PriorityQueue<>(queue1);
        for (String name : queue2) {
            if (!union.contains(name)) {
                union.add(name);
            }
        }
        System.out.println("Union: " + union);

        // 2. Find the Difference (Elements in queue1 NOT in queue2)
        PriorityQueue<String> difference = new PriorityQueue<>();
        for (String name : queue1) {
            if (!queue2.contains(name)) {
                difference.add(name);
            }
        }
        System.out.println("Difference (Q1 - Q2): " + difference);

        // 3. Find the Intersection (Elements present in both)
        PriorityQueue<String> intersection = new PriorityQueue<>();
        for (String name : queue1) {
            if (queue2.contains(name)) {
                intersection.add(name);
            }
        }
        System.out.println("Intersection: " + intersection);
    }
}