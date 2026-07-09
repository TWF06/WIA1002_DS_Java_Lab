package wia1002.lab7w9;

public class TestGraph {
    public static void main(String[] args) {
        Graph<String> myGraph = new Graph<>();

        System.out.println("--- 1. Adding Vertices ---");
        System.out.println("Added A: " + myGraph.addVertex("A"));
        System.out.println("Added B: " + myGraph.addVertex("B"));
        System.out.println("Added C: " + myGraph.addVertex("C"));
        System.out.println("Added D: " + myGraph.addVertex("D"));

        System.out.println("\n--- 2. Testing Directed addEdge ---");
        // A points to B, but B does NOT point to A
        System.out.println("Edge A -> B: " + myGraph.addEdge("A", "B"));

        System.out.println("\n--- 3. Testing addUndirectedEdge ---");
        // B points to C AND C points to B
        System.out.println("Edge B <-> C: " + myGraph.addUndirectedEdge("B", "C"));
        System.out.println("Edge C <-> D: " + myGraph.addUndirectedEdge("C", "D"));

        System.out.println("\n--- Current Graph Structure ---");
        myGraph.printGraph();

        System.out.println("\n--- 4. Testing removeEdge ---");
        System.out.println("Removing directed edge A -> B: " + myGraph.removeEdge("A", "B"));
        System.out.println("Trying to remove non-existent edge A -> D: " + myGraph.removeEdge("A", "D"));

        System.out.println("\n--- Final Graph Structure ---");
        myGraph.printGraph();
    }
}
