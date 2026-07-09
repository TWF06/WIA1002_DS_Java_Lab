package wia1002.lab7w9;

public class Graph<T> {
    private Vertex<T> head;
    private int size;

    public Graph() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    // Add a new vertex to the graph
    public boolean addVertex(T info) {
        if (hasVertex(info)) {
            return false;
        }
        // Insert new vertex at the head of the vertex list
        head = new Vertex<>(info, head);
        size++;
        return true;
    }

    // Check if a vertex exists
    public boolean hasVertex(T info) {
        Vertex<T> current = head;
        while (current != null) {
            if (current.vertexInfo.equals(info)) {
                return true;
            }
            current = current.nextVertex;
        }
        return false;
    }

    // Helper to retrieve a Vertex object
    private Vertex<T> getVertex(T info) {
        Vertex<T> current = head;
        while (current != null) {
            if (current.vertexInfo.equals(info)) {
                return current;
            }
            current = current.nextVertex;
        }
        return null;
    }

    // Add a directed edge from source to destination
    public boolean addEdge(T source, T destination) {
        if (!hasVertex(source) || !hasVertex(destination)) {
            return false;
        }

        Vertex<T> srcVertex = getVertex(source);
        Vertex<T> destVertex = getVertex(destination);

        // Insert the new edge at the front of the source vertex's edge list
        srcVertex.firstEdge = new Edge<>(destVertex, srcVertex.firstEdge);
        srcVertex.outDeg++;
        destVertex.inDeg++;
        return true;
    }

    // Add an undirected edge (bi-directional link)
    public boolean addUndirectedEdge(T source, T destination) {
        boolean edge1 = addEdge(source, destination);
        boolean edge2 = addEdge(destination, source);
        return edge1 && edge2;
    }

    // Remove an edge between source and destination
    public boolean removeEdge(T source, T destination) {
        if (!hasVertex(source) || !hasVertex(destination)) {
            return false;
        }

        Vertex<T> srcVertex = getVertex(source);
        Edge<T> currentEdge = srcVertex.firstEdge;
        Edge<T> previousEdge = null;

        while (currentEdge != null) {
            if (currentEdge.toVertex.vertexInfo.equals(destination)) {
                if (previousEdge == null) {
                    srcVertex.firstEdge = currentEdge.nextEdge;
                } else {
                    previousEdge.nextEdge = currentEdge.nextEdge;
                }
                srcVertex.outDeg--;
                currentEdge.toVertex.inDeg--;
                return true;
            }
            previousEdge = currentEdge;
            currentEdge = currentEdge.nextEdge;
        }
        return false; // Edge not found
    }

    // Print the adjacency list representation of the graph
    public void printGraph() {
        Vertex<T> currentVert = head;
        while (currentVert != null) {
            System.out.print(currentVert.vertexInfo + " -> ");
            Edge<T> currentEdge = currentVert.firstEdge;
            while (currentEdge != null) {
                System.out.print(currentEdge.toVertex.vertexInfo + " ");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            currentVert = currentVert.nextVertex;
        }
    }
}