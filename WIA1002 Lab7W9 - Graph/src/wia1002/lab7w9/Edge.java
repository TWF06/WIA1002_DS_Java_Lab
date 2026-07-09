package wia1002.lab7w9;

public class Edge<T> {
    public Vertex<T> toVertex;
    public Edge<T> nextEdge;

    public Edge(Vertex<T> toVertex, Edge<T> nextEdge) {
        this.toVertex = toVertex;
        this.nextEdge = nextEdge;
    }
}
